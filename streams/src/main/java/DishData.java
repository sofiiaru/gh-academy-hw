import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll() {
        return Arrays.asList(
                new Dish("pork",false, 800,Type.MEAT),
                new Dish("beef",false, 760,Type.MEAT),
                new Dish("chicken",false, 633,Type.MEAT),
                new Dish("rice",true, 600,Type.OTHER),
                new Dish("shrimp",false, 548,Type.FISH),
                new Dish("salmon",false, 670,Type.FISH)
        );

    }
}
