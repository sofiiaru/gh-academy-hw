package practiceLC;

import java.util.*;
import java.util.stream.Collectors;


public class FindDifference {
    public static void main(String[] args) {

        List<List<Integer>> l = findDifference(new int[] {1,2,3}, new int[] {6,4,2});
        l.forEach(x -> System.out.println(x));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        Set<Integer> set2 = new HashSet(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        Iterator <Integer> it = set1.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(set2.contains(i)) {
                it.remove();
                set2.remove(i);
            }

        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(set1.stream().toList());
        result.add(set2.stream().toList());
        return result;
    }
    /*
    class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         return new java.util.AbstractList<List<Integer>>() {
            List<Integer> distinct1 = null;
            List<Integer> distinct2 = null;

            @Override public int size() {
                return 2;
            }

            @Override public List<Integer> get(int i) {
                if (distinct1 == null) process();
                return i == 0 ? distinct1 : distinct2;
            }

            public void process() {
                distinct1 = new ArrayList<>();
                distinct2 = new ArrayList<>();

                byte[] seen1 = new byte[2001];
                for (int i = 0; i < nums1.length; i++) {
                    seen1[nums1[i]+1000] = 0b1;
                }

                byte[] seen2 = new byte[2001];
                for (int i = 0; i < nums2.length; i++) {
                    int num = nums2[i]+1000;
                    seen2[num] = 0b1;
                    if (seen1[num] == 0b0) {
                        distinct2.add(nums2[i]);
                        seen1[num] = 0b1;
                    }
                }

                for (int i = 0; i < nums1.length; i++) {
                    int num = nums1[i]+1000;
                    if (seen2[num] == 0b0) {
                        distinct1.add(nums1[i]);
                        seen2[num] = 0b1;
                    }
                }
            }
        };

    }
}
     */


    /*
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> numsList1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> numsList2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();



        for(Integer i: numsList1){
            if(!numsList2.contains(i) && !list1.contains(i)) list1.add(i);
        }
        for(Integer i: numsList2){
            if(!numsList1.contains(i) && !list2.contains(i)) list2.add(i);
        }
        result.add(list1);
        result.add(list2);
        return result;
    }*/
}
