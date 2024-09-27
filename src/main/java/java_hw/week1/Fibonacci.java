package java_hw.week1;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static long fib(int n){
        //map F(n-1) + F(n-2)
        int f1 = 0;
        int f2 = 1;
        Map<Integer, Long> map = new HashMap<>();
        map.put(1,0L);
        map.put(2,1L);
        for (int i = 3; i <= n; i++) {
            map.put(i, map.get(i-1) + map.get(i-2));
        }
        return map.get(n);

    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
