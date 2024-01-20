package Searching;

public class count1inSortedBinaryArray {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,0,0,1,1,1,1,1};
		// for array just find the 1st occurance with binary search in log n time .
		
		// Then count element from 1st occurance to the last because it is binary and sorted .
		// The result will be the answer
		printArray(array);
		
		

	}

}
