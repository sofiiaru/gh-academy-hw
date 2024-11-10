import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Sergey");
        map.put(2, "Chris");
        System.out.println(map.get(2));
        System.out.println(nonRepeatingChar("aaJava"));
    }

    public static Character nonRepeatingChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c:s.toCharArray()) if(map.get(c) == 1) return c;
        return null;
    }
}
