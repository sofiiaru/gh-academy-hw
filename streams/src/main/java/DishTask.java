import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //print all dishes less than 700 calories
        System.out.println("************");
        DishData.getAll().stream()
                .filter(x -> x.getCalories()<700)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("************");
        //print length of name of every dish
        DishData.getAll().stream()
                .map(x -> x.getName().length())
                .forEach(System.out::println);

        System.out.println("************");
        DishData.getAll().stream()
                .filter(x -> x.getCalories()>700)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("************");
        DishData.getAll().stream()
                .filter(x -> x.getCalories()>700)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

    }
}
