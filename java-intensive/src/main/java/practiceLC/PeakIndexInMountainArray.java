package practiceLC;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[] {3,4,5,1}));
    }

    static public int peakIndexInMountainArray(int[] arr) {
        String s = new String("sss");
        int length = arr.length;
        int start = 0, end = length-1;

        while(start < end) {
            int middle = ((end-start)/2)+start;
            if(arr[middle] > arr[middle -1]){
                if(arr[middle] > arr[middle+1]) return middle;
                else start = middle;
            }else end = middle;
        }
        return start;

    }
}
