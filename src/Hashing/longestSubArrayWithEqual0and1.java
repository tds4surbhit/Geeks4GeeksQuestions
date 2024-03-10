package Hashing;

import java.util.HashMap;

public class longestSubArrayWithEqual0and1 {

    public static int longestSubArrayWithEqual0and1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        HashMap<Integer,Integer> s = new HashMap<>();
        int maxresult = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum == 0){
                maxresult = i+1;
            }
            if(s.containsKey(sum)){
                int start = s.get(sum);
                int end = i;
                maxresult = Integer.max(maxresult,end-start);
            }
            if(!s.containsKey(sum)){
                s.put(sum,i);
            }
        }
        if(maxresult!=0){
            return maxresult;
        } else  {
            return -1;
        }

    }

    public static void main(String[] args){
        int[] arr = {1, 1, 1, 0, 1, 0, 1, 1, 1};
        System.out.println(longestSubArrayWithEqual0and1(arr));
    }
}
