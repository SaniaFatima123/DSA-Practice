import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//create comparator class and implement Comparator interface for object of type Movie/any class
public class NameComparatorPractice implements Comparator<Movie> {

    //override compare method from comparator interface
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

class MainClass{
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(7, "Tare Zamin Par"));
        list.add(new Movie(6, "krish"));
        list.add(new Movie(9,"Inception"));

        //pass the list and object of comparator class inside Collections.sort
        Collections.sort(list, new NameComparatorPractice());
        //printing the movie data using for enhanced for loop/for-each loop
        for(Movie data: list){
                    System.out.println("Movie name "+ data.getName() + " Ratings " + data.getRating());
                }

//        //practiced forEach with lambda for printing the movie list
//        list.forEach(
//                (data)->{
//                    System.out.println("Movie name "+ data.getName() + " Ratings " + data.getRating());
//                }
//        );


    }
}