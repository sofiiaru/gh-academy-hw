package practiceLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public String reverseWords(String s) {

        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        StringBuilder sb = new StringBuilder();
        for(int i = list.size()-1; i >= 0; i--){
            if(!list.get(i).isEmpty()) {
                sb.append(list.get(i)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    /*
        public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i].isEmpty()) continue;
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
     */

}
