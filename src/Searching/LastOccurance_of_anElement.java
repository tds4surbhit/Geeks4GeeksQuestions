package Searching;

public class LastOccurance_of_anElement {
	
	public static int getLastOccuranceOfANumber(int[] myArray, int x){
		int low = 0;
		int high = myArray.length-1;
		
		while(low <= high) {
			int temp = low + high;
			int mid = temp/2;
			
			if(myArray[mid] > x) {
				high = mid-1;
			} else if(myArray[mid] < x) {
				low = high+1;
			} else {
				if(mid == myArray.length-1 || myArray[mid] != myArray[mid+1]) {
					return mid;
				} else {
					low = mid + 1;
				}
			}
				
		}
		return -1;
	}
	
//	public static int getLastOccuranceOfANumber(int[] myArray, int low ,int high, int x){
//		if(low>high) {
//			return -1;
//		}
//		
//		int temp = low + high;
//		int mid = temp/2;
//		
//		if(myArray[mid] > x) {
//			return getLastOccuranceOfANumber(myArray,low,mid-1,x);
//		} else if(myArray[mid] < x) {
//			return getLastOccuranceOfANumber(myArray,mid+1,high,x);
//		} else {
//			if(mid == myArray.length-1 || myArray[mid] != myArray[mid+1]) {
//				return mid;
//			} else {
//				return getLastOccuranceOfANumber(myArray,mid+1,high,x);
//			}
//		}
//		
//	}
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {5,10,10,10,10,20,20};
		System.out.println("The Initial Array is:");
		printArray(myArray);
		
		int x = 10;
		
		int answer = getLastOccuranceOfANumber(myArray,x);
		System.out.println("The Answer is:" +answer);
		

	}

}
