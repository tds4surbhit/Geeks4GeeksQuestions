package Strings;
import java.util.Optional;
public class Palindrome {

    // Efficient Solution -->
    public static boolean checkPalindrome(String str){
       int start = 0 ;
       int end = str.length()-1;
       while (start < end){
           if(str.charAt(start) != str.charAt(end)){
               return false;
           } else {
               start++;
               end--;
           }
       }
       return true;
    }

    // Naive Solution -->
//    public static boolean checkPalindrome(String str){
//        StringBuffer rev = new StringBuffer(str);
//        rev.reverse();
//        return str.equals(rev.toString());
//    }
    public static void main(String[] args){
        String str = "nitini";
        Boolean extra = checkPalindrome(str);
        System.out.println(extra);
    }
}
