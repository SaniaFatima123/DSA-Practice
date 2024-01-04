//package code.recursion.basicQuestions.linkedList;
 package code.recursion.basicQuestions.linkedList;

public class CustomLL {

    private Node head;
    private Node tail;
    private int size;

    public CustomLL() {
        this.size = 0;
    }
    //Insert value at first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
         if(tail==null){
             tail = head;
         }
         size+=1;

    }
    //Insert value at last
   public void insertLast(int val){
        if(size==0){
            insertFirst(val);
            return;
        }
        Node node  = new Node(val);
        tail.next = node;
        tail = node;
        size++;
   }
    //Insert value at a given index
   public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(size==index){
            insertLast(val);
            return;
        }
        Node temp = head;
       for (int i = 1; i < index; i++) {
           temp = temp.next;
       }
       Node node = new Node(val,temp.next);
       temp.next = node;
       size++;
   }
    //find node with given index
   public Node get(int index){
        Node node= head;
       for (int i = 0; i < index; i++) {
           node = node.next;
       }
       return node;
   }
   //find node with given value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    //Delete value
   public int deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;
        return val;
   }
   //Delete at last
   public int deleteLast(){

        if(size<=1){
           return deleteFirst();
        }
       int val = tail.value;
        Node prev = get(size-2);
        tail = prev;
        tail.next = null;
        size--;
        return val;
   }
   //Delete from index
   public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
   }
    public  class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

    }
    public void display()
    {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
}
