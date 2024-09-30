package practiceLC;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings2("CXTXNCXTXNCXTXNCXTXNCXTXN", "CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN" ));
    }
    public static String gcdOfStrings(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        int max = Math.max(str1.length(), str2.length());

        while (max % min != 0){
            int temp = max % min;
            max = min;
            min = temp;
        }
        int gcd_length = min;


        String gcd = str1.substring(0, gcd_length);

        for( int i = 0; i+gcd.length() <= str1.length(); i+= gcd_length) {
            if(!str1.substring(i, i+gcd.length()).equals(gcd)) return "";
        }

        for( int i = 0; i+gcd.length() <= str2.length(); i+= gcd_length) {
            if(!str2.substring(i, i+gcd.length()).equals(gcd)) return "";
        }

        return gcd;
    }

    public static String gcdOfStrings2(String str1, String str2) {
        if (str1.charAt(0) != str2.charAt(0)) return "";

        StringBuilder gcd = new StringBuilder();

        if (str1.length() > str2.length()) gcd.append(str2);
        else gcd.append(str1);

        while (gcd.length() > 0) {
            String copyStr1 = new String(str1);
            String copyStr2 = new String(str2);
            copyStr1 = copyStr1.replaceAll(gcd.toString(), "");
            copyStr2 = copyStr2.replaceAll(gcd.toString(), "");

            if (copyStr1.isEmpty() && copyStr2.isEmpty()) return gcd.toString();
            else gcd.delete(gcd.length() - 1, gcd.length());
        }
        return gcd.toString();
    }
}
