package Sorting;

public class LomutoPartition {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void lomutopartitionExample(int[] arr) {
		int l = 0;
		int h = arr.length-1;
		int pivot = arr[h];
		
		int i = l-1;
		int j = l;
		
		for(j = l ; j < h-1; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp1 = arr[h];
		arr[h] = arr[i+1];
		arr[i+1] = temp1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,80,30,90,40,50,70};
		lomutopartitionExample(arr);
		printArray(arr);
		
		
	}

}
