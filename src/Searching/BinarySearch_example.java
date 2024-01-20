package Searching;

public class BinarySearch_example {
	
	//Iterative Solution -->
//	public static int binarySearchExample(int[] myArray, int x) {
//		int start = 0;
//		int end = myArray.length - 1;
//
//		
//		while(end >= start) {
//			int temp =start + end;
//			int mid = temp/2;
//			System.out.println(mid);
//			if(myArray[mid] == x) {
//				return mid;
//			} else if(myArray[mid] > x) {
//				end = mid-1;
//			} else {
//				start = mid+1;
//			}
//		}
//		return -1;
//	}
	
//	Recursive Solution -->
	public static int binarySearchExample(int[] myArray, int x, int low, int high) {
		if(low > high) {
			return -1;
		}
		
		int temp = low + high;
		int mid = temp/2;
		
		if(myArray[mid] == x) {
			return mid;
		} else if(myArray[mid] > x) {
			return binarySearchExample(myArray, x, low , mid-1);
		} else {
			return binarySearchExample(myArray, x, mid+1, high);
		}
				
	}
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The initial Array is::");
		int[] myArray = {10,20,30,40,50,60};
		printArray(myArray);
		int x = 80;
		int low = 0;
		int high = myArray.length - 1;
		
		int result = binarySearchExample(myArray, x, low , high);
		System.out.println("The result is:");
		System.out.println(result);
		
		
	}

}
