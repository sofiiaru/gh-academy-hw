import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        //all match
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<900);


        //any match
        if(DishData.getAll().stream().anyMatch((Dish::isVegetarian)))
            System.out.println("The menu is vegetarian friendly");

        //none match

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >=1000);


        //find any
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //find first
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());

    }
}
