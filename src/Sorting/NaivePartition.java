package Sorting;

public class NaivePartition {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static int[] naivePartionApproch(int[] arr, int v) {
		int k = 0;
		int l = 0;
		int r = arr.length-1;
		int[] temp = new int[r-l+1];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= arr[v]) {
				temp[k] = arr[i];
				k++;
			}
		}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > arr[v]) {
				temp[k] = arr[j];
				k++;
			}
		}
		for(int m = 0; m < temp.length ; m++) {
			arr[m] = temp[m];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,13,6,9,12,11,8};
		int v = 6;
		naivePartionApproch(arr,v);
		printArray(arr);
		
	}

}
