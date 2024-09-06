package ArraysPractice;

import java.util.Arrays;

public class MeanAndMedianOfAnArray {

    public static int mean(int[] arr){
        Arrays.sort(arr);
        int N = arr.length;

        int sum = 0;
        for (int each : arr){
           sum = sum + each;
        }
        return (int) (sum/N);
    }

    public static int median(int[] arr){
        if(arr.length % 2 != 0){
            return  arr[arr.length/2];
        } else {
            int middleElement = arr.length/2;
            int previousElement = middleElement-1;
            return arr[(int) (middleElement + previousElement)/ 2];
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 1, 1, 1, 1, 1};
        int meanValueOfArray = mean(arr);
        System.out.println(meanValueOfArray);

        int medianValue = median(arr);
        System.out.println(medianValue);
    }
}
