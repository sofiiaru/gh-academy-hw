package practiceLC;

public class MaxAverage {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {0,1,1,3,3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        int maxAvg = sum;

        for(int i = 1; i + k <= nums.length; i++) {
            sum = sum - nums[i-1] + nums[i+k-1];
            if(sum > maxAvg) maxAvg = sum;
        }

        return (double) maxAvg/k;
    }

   /* public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = -Double.MAX_VALUE;

        for(int i = 0; i+k <= nums.length; i++){
            double temp = 0;
            for(int j = i; j < i+k ; j++) {
                temp+=nums[j];
            }
            temp = temp/k;
            if(temp > maxAvg) maxAvg = temp;
        }
        return maxAvg;

    }*/

}
