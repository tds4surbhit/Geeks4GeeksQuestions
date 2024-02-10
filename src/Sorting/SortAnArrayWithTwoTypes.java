package Sorting;

public class SortAnArrayWithTwoTypes {

    public static void printArray(int[] arr) {
        for(int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void sortingTheArrays(int[] arr){
        int i = -1;
        int j = arr.length;
        while (true){
            do{
                i++;
            } while (arr[i] < 0);
            do{
                j--;
            } while (arr[j] > 0);
            if(i >= j){
                return;
            }
            swap(arr,i,j);
        }

    }

    public static void main(String[] args){
        int[] arr = {-12,18,-10,15};
        sortingTheArrays(arr);
        printArray(arr);
    }
}
