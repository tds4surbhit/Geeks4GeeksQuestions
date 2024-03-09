package Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean subArrayWithZeroSum(int arr[]){
        HashSet<Integer> s = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum = sum + arr[i];
            if(s.contains(sum)){
                return true;
            }
            else {
                s.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {-3,4,-3,-1,1};
        boolean ans = subArrayWithZeroSum(arr);
        System.out.println(ans);
    }
}
