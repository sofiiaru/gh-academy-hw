package practiceLC;

public class ProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int current;
        do{
            current = n % 10;
            product *= current;
            sum += current;

            n /= 10;
        } while (n > 0);

        return product - sum;
    }
}
