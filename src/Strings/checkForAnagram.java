package Strings;

import java.sql.Array;

public class checkForAnagram {

    public static boolean checkForAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] tempArray = new int[26];

        for(int i = 0 ; i < str1.length(); i++){
            tempArray[str1.charAt(i) - 'a']++;
            tempArray[str2.charAt(i) - 'a']--;
        }

        for(int i = 0 ; i < tempArray.length ; i++){
            if(tempArray[i] != 0){
                return false;
            }
        }

        return  true;
    }

    public static boolean checkForAnagram2(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] tempArray = new int[26];

        for(int i = 0 ; i < str1.length(); i++){
            tempArray[str1.charAt(i) - 'a']++;
            tempArray[str2.charAt(i) - 'a']--;
        }

        for(int i = 0 ; i < tempArray.length ; i++){
            if(tempArray[i] != 0){
                return false;
            }
        }


        return  true;
    }


    pulblic static void main(String[] args){
        String str1 = "aabca";
        String str2 = "acaba";
        Boolean ans = checkForAnagram(str1,str2);
        System.out.println(ans);
    }
}
