package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    public static boolean subArrayWithGivenSum(int arr[], int givenSum){
        HashSet<Integer> s = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum = sum + arr[i];
            int checkingSum = sum - givenSum;
            if(s.contains(checkingSum)){
                return true;
            }
             if(sum == 22){
                 return  true;
             }
                s.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {5,8,6,13,3,-1};
        int givenSum = 22;
        boolean ans = subArrayWithGivenSum(arr,givenSum);
        System.out.println(ans);
    }
}
