import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier): is used to create a collection using collector
        //can use ArrayList, HashSet etc

        List<Integer> evenNums = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        //toList(), toSet(): return Collector interface taht gathers the input data into a new list
        List<Integer> evenNums2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        //toMap(Function,Function)
        Map<String, Integer> map = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        //counting(): returns Collector that counts teh number of elements
        //summingInt(ToIntFunction) - returns a Collector that produces
        int sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        //averagingInt(ToIntFunction)

        //joining() : is used to join various elements of a character or a string array into single string obj

        List<String> list = Arrays.asList(
                "Java", "JS", "CS50"
        );

        String s = list.stream().collect(Collectors.joining("*"));
        System.out.println(s);

        //partitioningBy() - partition the stream based on given predicate
        Map<Boolean, List<Dish>> veggieNonVeggieDishes = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieNonVeggieDishes);

        //groupingBy(): for grouping objects by soem property and storing results in a map

        Map<Type, List<Dish>> byDishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));





    }
}
