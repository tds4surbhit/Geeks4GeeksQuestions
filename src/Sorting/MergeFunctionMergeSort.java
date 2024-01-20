package Sorting;

public class MergeFunctionMergeSort {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void mergeFunction(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		int temp = low + high;
		int mid = temp/2;
		
		
		// we divide the array into two parts
		int firstArrayLength = mid-low+1;
		int secoundArrayLength = high-mid;
		int[] left = new int[firstArrayLength];
		int[] right = new int[secoundArrayLength];
		
		//tricky part -->
		for(int i = 0; i < firstArrayLength; i++) {
			left[i] = arr[low+i];
		}
		
		for(int i = 0; i < secoundArrayLength; i++) {
			right[i] = arr[mid+i+1];
		}

		int[] newArray = new int[arr.length];
		int i = 0;
		int j = 0;
		int key = 0;
		
		while(i < mid-low+1 && j < high-mid) {
			if(left[i] <= right[j]) {
				newArray[key] = left[i];
				i++;
				key++;
			} else {
				newArray[key] = right[j];
				j++;
				key++;
			}
		}
		
		while(i < mid-low+1) {
			newArray[key] = left[i];
			i++;
			key++;
		}
		
		while(j < high-mid) {
			newArray[key] = right[j];
			j++;
			key++;
		}
		
		System.out.println("The sorted array is");
		printArray(newArray);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("The original array is:");
		int[] arr = {10,20,40,20,30};
		printArray(arr);
		mergeFunction(arr);
	}

}
