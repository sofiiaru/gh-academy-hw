package practiceLC;

import java.util.*;

public class MaxNumberOfVowelsInSubstring {

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }

    public static int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet(Arrays.asList('a', 'e','i', 'o', 'u'));

        int numOfvowels = 0;
        for (int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i)))numOfvowels++;
        }

        int maxVowels = numOfvowels;

        for (int i = 1; i+k <= s.length(); i++){
            if(vowels.contains(s.charAt(i-1))) numOfvowels--;
            if(vowels.contains(s.charAt(i+k-1))) numOfvowels++;

            if(numOfvowels > maxVowels)  maxVowels = numOfvowels;

        }

        return maxVowels;

    }
}
