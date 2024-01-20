package Sorting;

public class KthSmallestArray {

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int lomutoLogic(int[] arr, int l , int h){
        int i = l-1;
        int pivot = arr[h];
        for(int j = l ; j < h; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i+1, h);
        return i+1; // we are returning the place that owns the pivot point.
    }

    public static int findKthSmallestArray(int[] arr, int k , int l , int h){
        while (l < h){
            int pivotPlace = lomutoLogic(arr,l,h);
            if(pivotPlace == k-1){
                return arr[pivotPlace];
            } else if (pivotPlace < k - 1) {
                l=pivotPlace+1;
            } else {
                h=pivotPlace-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int k = 6;
        int l = 0;
        int h = arr.length-1;
        int answer = findKthSmallestArray(arr,k,l,h);
        System.out.println("The the Kth smallest element is:" +answer);
    }
}
