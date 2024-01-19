import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice implements Comparable<ComparablePractice> {

    private int age;
    private String name;

    public ComparablePractice(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        Salary = salary;
    }

    private double Salary;



    @Override
    public int compareTo(ComparablePractice comp){
       return this.age-comp.age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public static void main(String[] args) {
        List<ComparablePractice> list = new ArrayList<ComparablePractice>();
        ComparablePractice obj1 = new ComparablePractice(22,"Soha",33581.56);
        ComparablePractice obj2 = new ComparablePractice(45,"Seema",85581.56);
        ComparablePractice obj3 = new ComparablePractice(36,"Sanjay",544581.56);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        for(ComparablePractice object: list){
            System.out.println("Name "+ object.getName() + " Age "+ object.getAge());
        }

    }
}
