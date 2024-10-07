package java_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    /*Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the
    same element twice.
    You can return the answer in any order.
    class Solution {

    }*/

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) return new int[] {map.get(nums[i]), i};
            else map.put(target - nums[i], i);
        }
        return new int[]{};
    }

}
