package practiceLC;

public class Flowerbed {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1,1,0,0}, 2));
    }

        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
            if (n > flowerbed.length) return false;
            int previous, next;

            for (int i = 0; i < flowerbed.length && n > 0; i++) {
                if(flowerbed[i] == 0) {
                    previous = i == 0? 0 : flowerbed[i-1];
                    next = i == flowerbed.length -1? 0 : flowerbed[i+1];
                    if(previous == 0 && next == 0) {
                        n--;
                        i++;
                    }
                }
            }
            return n == 0;

        }

}
