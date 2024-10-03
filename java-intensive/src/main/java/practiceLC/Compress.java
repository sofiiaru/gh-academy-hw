package practiceLC;

public class Compress {
    public static void main(String[] args) {
        char[] chars = {'a','b', 'c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int frequency = 1;
        s.append(chars[0]);
        for (int i = 1; i< chars.length; i++) {
            if(chars[i] == chars[i-1]){
                frequency ++;
            } else {
                if(frequency != 1) s.append(frequency);
                s.append(chars[i]);
                frequency = 1;
            }
        }
        if(frequency != 1) s.append(frequency);

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();

    }
}
