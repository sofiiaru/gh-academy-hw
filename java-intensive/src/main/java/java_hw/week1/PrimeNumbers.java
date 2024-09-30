package java_hw.week1;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    static boolean isPrime(int n){
        if(n>1 && n <=3) return true;
        if(n<=1 || n%2 == 0 || n%3 == 0) return false;

        return true;
    }
}
