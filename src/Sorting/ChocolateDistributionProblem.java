package Sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int chocolateBatneMeiInsaaf(int[] arr, int m){
        if(m > arr.length){
            return  -1;
        }
        Arrays.sort(arr);

        int result = arr[m-1] - arr[0];
        for(int i = 3; i < arr.length; i++){
            result = Math.min(result,arr[i]-arr[i-m]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {3,4,1,9,56,7,9,12};
        int m = 3;
        System.out.println("The Minimum difference that the children have between chocolates given is:");
        System.out.println(chocolateBatneMeiInsaaf(arr,m));
    }
}
