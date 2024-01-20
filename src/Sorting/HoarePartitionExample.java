package Sorting;

public class HoarePartitionExample {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr , int i , int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	public static int hoarepartitionExample(int[] arr) {
		int l = 0;
		int h = arr.length-1;
		int i = l-1;
		int j = h+1;
		int pivot = arr[l];
		
		while(true) {
			do {
				i++;
			} while (arr[i] < pivot);
			
			do {
				j--;
			} while (arr[j] > pivot);
			if(i >= j) {
				return j;
			}
			swap(arr,i,j);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {5,3,8,4,2,7,1,10};
		 int j = hoarepartitionExample(arr);
		 System.out.println(j);
		 printArray(arr);
		
	}

}
