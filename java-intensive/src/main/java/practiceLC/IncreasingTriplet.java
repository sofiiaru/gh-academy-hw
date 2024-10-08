package practiceLC;

public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] nums = new int[] {9,10,5,11,10,9,8};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        for(int i =0, j = i+1, k = i+2; k < nums.length; i++, j++, k++) {
            if(nums[i] < nums[j] && nums[j] < nums[k]) return true;

        }
        int min, max, middle;
        for(int i =0, j = i+1, k = i+2; k < nums.length; i++, j++, k++) {
            if(nums[i] < nums[j]){

            }

        }



        return false;

    }
}
