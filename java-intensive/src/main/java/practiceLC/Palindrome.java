package practiceLC;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for(int i = 0, j = s.length()-1; i < j; ) {
            char currentI = s.charAt(i), currentJ = s.charAt(j);
            if(!Character.isDigit(currentI) && !isLetter(currentI)) {
                i++;
                continue;
            }
            if(!Character.isDigit(currentJ) && !isLetter(currentJ)) {
                j--;
                continue;
            }
            if(currentI != currentJ) return false;
            else i++; j--;
        }
        return true;
    }

    public static boolean isLetter(char c){
        if((c >= 97 && c <= 122) || (c >= 65 && c <= 90)) return true;
        else return false;
    }

}
