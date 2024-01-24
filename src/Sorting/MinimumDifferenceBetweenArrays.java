package Sorting;
import java.util.Arrays;

public class MinimumDifferenceBetweenArrays {

    public static int findMinDifference(int[] arr){
        Arrays.sort(arr);
        int Result = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            Result = Math.min(Result,arr[i]-arr[i-1]);
        }
        return Result;
    }

    public static void main(String[] args){
        int[] arr = {1,7,45,34,74,55,434};
        System.out.println("The Min Difference is:");
        System.out.println(findMinDifference(arr));
    }
}
