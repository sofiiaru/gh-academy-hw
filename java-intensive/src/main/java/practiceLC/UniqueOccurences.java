package practiceLC;

import java.util.*;

public class UniqueOccurences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,1,1,2,2,3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 1)+1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.values().size();

    }
}
