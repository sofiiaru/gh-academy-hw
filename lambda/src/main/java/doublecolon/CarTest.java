package doublecolon;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //zero argument constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());


        //One Argument

        Function<String, Car> f1 = make -> new Car(make);
        System.out.println(f1.apply("Volvo").getMake());

        Function<String, Car> f2 = Car::new;
        System.out.println(f2.apply("Mersedes").getMake());


        //Two Argument

        BiFunction<String,Integer,Car> b1 = (make,model) -> new Car(make,model);
        Car honda = b1.apply("Honda", 2007);
        System.out.println(honda.getMake());

        BiFunction<String,Integer,Car> b2 = Car::new;
        Car nissan = b2.apply("Nissan", 2001);
        System.out.println(nissan.getMake());

    }
}
