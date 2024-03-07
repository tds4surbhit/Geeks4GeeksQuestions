package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctNumbers {

    public static int findDistinctNumbers(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr){
            s.add(i);
        }
        return s.size();
    }
    public static void main(String[] args){
        int[] arr = {2,3,3,4,4,56,6,7,7,8};
        int ans = findDistinctNumbers(arr);
        System.out.println(ans);
    }
}
