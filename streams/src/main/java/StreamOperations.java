import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,3,7,3,5,2);
        list.forEach(x->System.out.print(x));
        System.out.println();
        //or
        list.forEach(System.out::print);
        System.out.println();

        //**********FILTER*********
        list.stream()
                .filter(x -> x%2==0)
                .distinct()
                .forEach(System.out::print);


        //*********LIMIT*******
        System.out.println("LIMIT");
        list.stream()
                .filter(x -> x%2==0)
                .limit(1)
                .forEach(System.out::println);


        //*****SKIP*****
        System.out.println("SKIP");
        list.stream()
                .filter(x -> x%2==0)
                .skip(2)
                .forEach(System.out::println);

        //********MAP********
        System.out.println("MAP");
        list.stream()
                .map(number -> number*5)
                .filter(i -> i%3 == 0)
                .forEach(System.out::println);

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);




    }

    @Test
    public void test1(){}
}
