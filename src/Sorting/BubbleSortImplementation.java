package Sorting;

public class BubbleSortImplementation {
	
	public static void bubbleSort(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			boolean isShifted = false;
			for(int j = 0; j < array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isShifted = true;
				}
			}
			if(isShifted == false) {
				break;
			}
		}
		printArray(array);
	}
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,10,8,7};
		System.out.println("The Initial Array given is:");
		printArray(array);
		System.out.println("The Sorted Array is:");
		bubbleSort(array);
		
		
		

	}

}
