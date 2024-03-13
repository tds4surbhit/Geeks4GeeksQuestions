package Strings;

public class checkforSubSequence {
    // subsequence means elements in 1st array should be present in the same order in the second array

    public static boolean checkForSubSequence(String str1 , String str2){
        int i = 0;
        int j = 0;
        while(i < str1.length()){
            if(str1.charAt(i) != str2.charAt(j)){
                i++;
            } else  {
                i++;
                j++;
            }
        }
        if(j == str2.length()){
            return true;
        } else
        return false;
    }
    public static void main(String[] args){
        String str1 = "ABCD";
        String str2 = "AD";
        Boolean ans = checkForSubSequence(str1, str2);
        System.out.println(ans);
    }
}
