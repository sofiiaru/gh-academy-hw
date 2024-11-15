package doublecolon;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        //reference to static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,230);


        //Reference to instance method

        Calculate m1 = (x,y) -> new Calculator().findProduct(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findProduct;
        m2.calculate(8,9);


        Calculate m3 = new Calculator()::findProduct;
        m3.calculate(6,6);


        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer", 6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(23);







    }
}
