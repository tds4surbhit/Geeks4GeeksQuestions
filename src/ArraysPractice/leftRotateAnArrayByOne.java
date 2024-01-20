package ArraysPractice;

public class leftRotateAnArrayByOne {
	
	

	public static void main(String[] args) {
		int[] myArray = {2,3,4,5,6};
		System.out.print("The Original Array is:");
		printArray(myArray);
		int[] newArray = shiftLeft(myArray);
		printArray(newArray);
	}
	
	public static int[] shiftLeft(int[] arr) {
		int temp = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
