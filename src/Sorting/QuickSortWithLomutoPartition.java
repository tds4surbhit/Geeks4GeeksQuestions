package Sorting;

public class QuickSortWithLomutoPartition {

    public static void swapMethod(int[] arr, int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int partitionLogic(int[] arr, int l, int h){
        int i = l-1;
        int pivot = arr[h];
        for(int j = l; j < h ; j++){
            if(arr[j] <= pivot){
                i++;
                swapMethod(arr, i, j);
            }
        }
        swapMethod(arr, i + 1 , h);
        return i+1;
    }

    public static void printArray(int[] arr) {
        for(int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void QuickSortWithLomutoPartition(int[] arr, int l, int h){
        if(h>l){
            int partitionElement = partitionLogic(arr,l,h);// partition element comes at its correct place .
            QuickSortWithLomutoPartition(arr,l,partitionElement-1);
            QuickSortWithLomutoPartition(arr,partitionElement+1,h);
        }
    }

    public static void main(String[] args){
        int[] arr = {8,4,7,9,3,10,5};
        int l = 0;
        int h = arr.length - 1;
        QuickSortWithLomutoPartition(arr,l,h);
        printArray(arr);
    }
}
