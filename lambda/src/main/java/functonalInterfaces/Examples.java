package functonalInterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //*******PREDICATE******
        //boolean

        //using Anonymus class
        /*Predicate<Integer> lesserThan = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer<18;
            }
        };

        lesserThan.test(50);*/

        Predicate<Integer> lesserThan = n -> n < 18;
        Boolean result = lesserThan.test(50);
        System.out.println(result);


        //******CONSUMER****
        //void

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(4);


        //******BICONSUMER******
        //void, 2 param

        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(3,4);

        //******FUNCTION*******
        //T,R - accept and return
        Function<String,String> fun = s -> "Hello" + s;
        String str = fun.apply("Ozzy");
        System.out.println(str);


        //*******SUPPLIER******
        //no param, returns
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());



    }
}
