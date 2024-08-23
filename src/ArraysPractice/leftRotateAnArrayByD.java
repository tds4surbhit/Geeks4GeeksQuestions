package ArraysPractice;

public class leftRotateAnArrayByD {
	
	public static int[] leftRotateArrayByTwo(int[] arr, int d) {
		int[] tempArray = new int[d];
		for(int i = 0; i < d; i++) {
			tempArray[i] = arr[i];
		}
		System.out.println("The temp array is:");
		printArray(tempArray);
		
		for(int i = d ; i < arr.length; i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i = 0; i < tempArray.length; i++) {
			arr[arr.length-d + i] = tempArray[i];
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Initial Array is:");
		int d = 2;
		int[] myArray = {2,3,4,5,6};
		int[] myArray1 = {4,5,6,8,9};
		printArray(myArray);
		
		int[] newRotatedArray = leftRotateArrayByTwo(myArray,d);
		System.out.println("The Final Rotated Array is:");
		printArray(newRotatedArray); 
	}

}
