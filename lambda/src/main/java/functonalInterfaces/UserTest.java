package functonalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("John", "Doe", 34));
        users.add(new User("James", "Bond", 45));
        users.add(new User("Ava", "Enro", 30));

        Consumer<User> printUser = u -> System.out.println(u.toString());
        for(User u:users) printUser.accept(u);

        Predicate<User> startE = u -> u.getLastName().startsWith("E");
        printName(users, startE);

        //print all
        printName(users, p->true);











    }

    private static void printName(List<User> users, Predicate<User> p){
        for(User u:users) {
            if(p.test(u)){
                System.out.println(u.toString());
            }
        }
    }
}
