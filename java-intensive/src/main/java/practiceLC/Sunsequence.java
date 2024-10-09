package practiceLC;

public class Sunsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgfdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int length = s.length();
        if(length == 0) return true;
        for(int i = 0, j= 0; i< length && j < t.length(); j++) {
            if(s.charAt(i) == t.charAt(j)) {
                if(i == length - 1) return true;
                i++;
            }
        }
        return false;
    }
}
