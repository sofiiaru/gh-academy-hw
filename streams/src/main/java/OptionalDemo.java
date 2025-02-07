import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6,3,2,23);

        //empty() - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(numbers).isPresent());

        //ifPresent()
       Optional<Integer> bigNum = numbers.stream().filter(x -> x>8).findAny();

       //get
        System.out.println(bigNum.get());

        //orElse()
        System.out.println(bigNum.orElse(0));

    }
}
