import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();

        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));

        System.out.println(mySet);
        System.out.println(mySet.add(new Student(8, "Ahmet")));
        System.out.println(firstRepeatingCharacter("Java"));



    }

    public static Character firstRepeatingCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(!set.add(c)) return c;
        }
        return null;
    }
}
