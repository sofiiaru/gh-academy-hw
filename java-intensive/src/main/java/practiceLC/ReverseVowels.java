package practiceLC;

import java.util.*;

public class ReverseVowels {
    public String reverseVowels(String s) {
        //StringBuilder result = new StringBuilder(s.length());
        Set<Character> vowels= new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] result = s.toCharArray();

        for (int i = 0, j = result.length-1; i < j;){
            if(vowels.contains(result[i])) {
                while(!vowels.contains(result[j]) && i < j){
                    j--;
                }
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
                i++;
                j--;
            }else i++;
        }
        return new String(result);

        /*

        for (int i = s.length()-1; i >= 0; i--){
            if(vowels.contains(s.charAt(i))){
                sVowels.add(s.charAt(i));
            }
        }
        for (int i = 0, j = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))) {
                result.append(sVowels.get(j));
                j++;
            }
            else result.append(s.charAt(i));
        }
        return result.toString();

         */

        /*
          for(int i = 0, j = s.length()-1; i < s.length() && j >= -1; ){
            if(!vowels.contains(s.charAt(i))) {
                result.append(s.charAt(i));
                i++;
                continue;
            }else {
                if(vowels.contains(s.charAt(j))){
                    result.append(s.charAt(j));
                    i++;
                }
                j--;
            }
        }

        return result.toString();
         */


    }
}

