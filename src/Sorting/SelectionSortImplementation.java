package Sorting;

public class SelectionSortImplementation {
	
	public static void selectionSortImplementation(int[] arr) {
		for(int i = 0 ; i < arr.length-1; i++) {
			int minIndex = i;//stricky part, that can be missed easily
			for(int j = i + 1 ; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("The Final Array is:");
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
		int[] arr = {10,5,8,20,2,18};
		System.out.println("The original Array is:");
		printArray(arr);
		
		selectionSortImplementation(arr);
		
		
	}

}
