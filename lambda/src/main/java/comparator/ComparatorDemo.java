package comparator;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);

        //asc sort
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, (o1,o2) -> (o1>o2)? -1:(o2<o1)?1:0);


        //asc order
        list.sort((o1,o2) -> o1.compareTo(o2));
        //desc
        list.sort((o2,o1) -> o2.compareTo(o1));


        List<Apple> myInventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(79, Color.RED),
                new Apple(100, Color.GREEN)
        );

        Comparator<Apple> sortApple= comparing((apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        //simplify
        //myInventory.sort(comparing(apple -> apple.getWeight()));
        myInventory.sort(comparing(Apple::getWeight));

        //reverse
        myInventory.sort(comparing(Apple::getWeight).reversed());

    }
}
