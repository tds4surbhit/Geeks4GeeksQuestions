package Searching;

public class FirstOccuranceOfANumber {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
//	this is a recursive approch
//	public static int getFirstOccuranceOfANumber(int[] myArray, int low, int high, int x) {
//		if(low >= high) {
//			return -1;
//		}
//		
//		int temp = low + high;
//		int mid = temp/2;
//		
//		if(myArray[mid] > x) {
//			return getFirstOccuranceOfANumber(myArray,low,mid-1,x);
//		} else if(myArray[mid] < x) {
//			return getFirstOccuranceOfANumber(myArray,mid+1,high,x);
//		} else {
//			if(mid == 0 || myArray[mid-1] != myArray[mid]) {
//				return mid;
//			}
//			else {
//				return getFirstOccuranceOfANumber(myArray,low,mid-1,x);
//			}
//		}
//	}
	
//	Iterative approchs -->
	public static int getFirstOccuranceOfANumber(int[] myArray, int low, int high, int x) {
		int temp = low + high;
		int mid = temp/2;
		
		while(low <= high) {
			if(myArray[mid] > x) {
				high = mid - 1;
			}else if(myArray[mid] < x) {
				low = mid + 1;
			}else {
				if(mid == 0 || myArray[mid-1] != myArray[mid]) {
					return mid;
				} else {
					high = mid - 1;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {5,10,10,2,20};
		int x = 10;
		System.out.println("The Initial Array::");
		
		printArray(myArray);
		int low = 0;
		int high = myArray.length - 1;
		int result = getFirstOccuranceOfANumber(myArray,low,high,x);
		System.out.println("Result");
		System.out.println(result);
		
	}

}
