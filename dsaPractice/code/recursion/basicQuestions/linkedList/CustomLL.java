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
    //inserting using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    public Node insertRec(int val, int index, Node node){
        if(index == 0){
           Node temp = new Node(val,node);
           size++;
           return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates(){
        Node node = head;

        while (node.next!=null){
            if(node.value == node.next.value){
                      node.next = node.next.next;
                      size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    public static  CustomLL merge(CustomLL first, CustomLL second){
        Node f = first.head;
        Node s = second.head;

        CustomLL ans = new CustomLL();

        while (f!=null && s!=null){
            if(f.value<s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }
                else{
                    ans.insertLast(s.value);
                    s = s.next;
                }
        }
        if(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        if(s!=null){
            ans.insertLast(s.value);
            s =s.next;
        }
        return ans;
    }
    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }
    //reversing a LL using recursion
    public void reverseRec(Node node){
        if(node==tail){
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        node.next = null;
    }
    //reversing a LL using iterative
    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public void reverse(Node node){
        Node prev = null;
        Node pres = head;
        Node next = pres.next;
        if(size<2){
            return;
        }
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next.next!=null) {
                next = next.next;
            }
        }
        head = prev;
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

    public static void main(String[] args) {
//        CustomLL ll = new CustomLL();
//        ll.insertLast(1);
//        ll.insertLast(3);
//        ll.insertLast(8);
//        ll.insertLast(9);
//        ll.insertLast(13);
//        ll.insertLast(32);
//        ll.display();
//        System.out.println("Inserting using recursion ********");
//        ll.insertRec(15,3);
//        ll.display();

//        CustomLL ll = new CustomLL();
//        ll.insertLast(1);
//        ll.insertLast(1);
//        ll.insertLast(1);
//        ll.insertLast(2);
//        ll.insertLast(3);
//        ll.insertLast(3);
//        ll.display();
//        System.out.println("removing duplicates ********");
//        ll.duplicates();
//        ll.display();

//        System.out.println("Merging 2 linkedList ********");
//        CustomLL l1 = new CustomLL();
//        l1.insertLast(1);
//        l1.insertLast(3);
//        l1.insertLast(5);
//
//        CustomLL l2 = new CustomLL();
//        l2.insertLast(1);
//        l2.insertLast(4);
//        l2.insertLast(9);
//        l2.insertLast(14);
//
//        CustomLL ans  = merge(l1, l2);
//        ans.display();

    }
}
