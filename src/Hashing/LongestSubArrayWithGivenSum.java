package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static int findTheLongestSubArrayWithGivenSum(int[] arr, int givenSum){
        HashMap<Integer,Integer> s = new HashMap<>();
        int sum = 0;
        int res = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum = sum + arr[i];
            if(s.containsKey(sum-givenSum)){
                int startPoint =  s.get(sum-givenSum);
                int endpoint = i;
                int difference =  endpoint-startPoint;
                res = Integer.max(res,difference);
            }
            if(sum == givenSum){
                return i+1;
            }
            s.put(sum,i);
        }
        if(res != 0){
            return res;
        }
        return -1;

    }

    public static void main(String[] args){
        int[] arr = {8,3,1,5,-6,6,2,2};
        int givenSum = 4;
        int ans = findTheLongestSubArrayWithGivenSum(arr,givenSum);
        System.out.println(ans);


    }
}
