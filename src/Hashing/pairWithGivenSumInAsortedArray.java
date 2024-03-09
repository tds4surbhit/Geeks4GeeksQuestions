package Hashing;

import java.util.HashSet;

public class pairWithGivenSumInAsortedArray {

    public static boolean checkforThePairOfSumInAsortedArray(int[] arr, int sum){
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr){
            if(s.contains(sum - i)){
                return true;
            }
            else {
                s.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {8,3,4,2,5};
        int sum = 8;
        boolean ans = checkforThePairOfSumInAsortedArray(arr,sum);
        System.out.println(ans);

    }
}
