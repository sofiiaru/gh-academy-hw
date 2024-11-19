import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6,9);

        int result = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(result);

        //no initial value
        Optional<Integer> result2 = numbers.stream().reduce( (a, b) -> a+b);
        System.out.println(result2);


        //max and min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        Optional<Integer> count = DishData.getAll().stream()
                .map(dish -> 1)
                .reduce(Integer::sum);
        System.out.println(count.get());

        //print first 10 fibonacci numbers
        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1], a[0]+a[1]} ).limit(10).forEach(a -> System.out.println("("+a[0]+","+a[1]+")"));
    }
}
