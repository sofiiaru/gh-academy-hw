package practiceLC;

public class ThirdMax {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,3,4,5}));
    }
    public static int thirdMax(int[] nums) {
        int length = nums.length;
        if(length == 1) return nums[0];
        if(length == 2) return Math.max(nums[0], nums[1]);

        //
        Integer max = null, secondMax = null, thirdMax = null;


        for(int num : nums) {
            if(max == null) max = num;
            else if (secondMax == null) {
                if(num == max) continue;
                if(num > max){
                    secondMax = max;
                    max = num;
                } else secondMax = num;
            }else if(thirdMax == null){
                if(num == max || num == secondMax) continue;
                if(num > max){
                    thirdMax = secondMax;
                    secondMax = max;
                    max = num;
                }else if(num > secondMax) {
                    thirdMax = secondMax;
                    secondMax = num;
                }else thirdMax = num;
            }else if(num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }else if(secondMax != null && num > secondMax && num != max) {
                thirdMax = secondMax;
                secondMax = num;
            }else if (thirdMax!= null && num > thirdMax && num != max && num != secondMax) {
                thirdMax = num;
            }
        }

        return thirdMax == null? max : thirdMax;

    }
}
