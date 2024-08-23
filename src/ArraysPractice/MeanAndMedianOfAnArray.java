package ArraysPractice;

import java.util.Arrays;

public class MeanAndMedianOfAnArray {

    public int mean(int[] arr){
        Arrays.sort(arr);
        int N = arr.length;

        int sum = 0;
        for (int each : arr){
           sum = sum + each;
        }
        return  integer(sum/N);
    }

    public int median(int[] arr){

    }

    public static void main(String[] args){
        int[] arr = {1,2,19,28,5};
        mean(arr);
    }
}
