package practiceLC;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        for( int i = 0, j = 0; j < nums.length; j++){
            if(i == j && nums[i] != 0 ){
                i++;
            } else if(nums[j] != 0 && i != j) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }

   /* public static void moveZeroes(int[] nums) {
        int zeroPointer = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && zeroPointer > -1) {
                nums[zeroPointer] = nums[i];
                nums[i] = 0;
                i = zeroPointer;
                zeroPointer = -1;
            } else if(nums[i] == 0 && zeroPointer == -1) zeroPointer = i;
        }
    }*/
}
