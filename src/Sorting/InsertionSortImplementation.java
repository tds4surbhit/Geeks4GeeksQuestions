package Sorting;

public class InsertionSortImplementation {
	
	public static void insertionSortImplementation(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20,5,40,60,10,30};
		System.out.println("The Initial Array given is:");
		printArray(array);
		System.out.println("The Sorted Array is:");
		insertionSortImplementation(array);
	}

}
