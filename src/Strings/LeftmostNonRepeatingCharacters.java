package Strings;

import java.sql.Array;
import java.util.Arrays;

public class LeftmostNonRepeatingCharacters {

    public static int leftmostNonReaptingCharacters(String str){
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        for(int i = 0 ; i < str.length(); i++){
           if(arr[str.charAt(i)] == -1){
               arr[str.charAt(i)] = i;
           } else {
               arr[str.charAt(i)] = -2;
           }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] >= 0){
                res= Math.min(res,arr[i]);
            }
        }

        if(res == Integer.MAX_VALUE){
            return -1;
        } else {
            return res;
        }

    }

    public static void main(String[] agrs){
        String str = "abbcbda";
        int ans = leftmostNonReaptingCharacters(str);
        System.out.println(ans);

    }
}
