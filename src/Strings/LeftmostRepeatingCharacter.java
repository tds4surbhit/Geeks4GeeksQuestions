package Strings;

public class LeftmostRepeatingCharacter {

    public static int leftMostRepeatingCharacter(String str){
        int[] arr = new int[256];
        for(int i = 0 ; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String str = "abccbd";
        int ans = leftMostRepeatingCharacter(str);
        System.out.println("Ans is this" + ans);
    }
}
