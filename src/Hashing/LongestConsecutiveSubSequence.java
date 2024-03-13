package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSubSequence {

    public static int longestConsuectiveSubSequence(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr){
            s.add(i);
        }

        // traversing through the Hashmap -->
        int finalMaxLength = 0;
        int maxLength = 0;
        for(Integer i : s){
            if(s.contains(i-1)){
                maxLength++;
                finalMaxLength = Integer.max(finalMaxLength,maxLength);
            } else {
                maxLength=1;
            }
        }
        if(finalMaxLength != 0){
            return finalMaxLength;
        } else  {
            return 0;
        }

    }

    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};//1,3,4,2,9,10
        int ans = longestConsuectiveSubSequence(arr);
        System.out.println("The answer" + ans);

    }
}
