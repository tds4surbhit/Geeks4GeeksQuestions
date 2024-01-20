package ArraysPractice;

public class MaxDifference {
	
	public static int findMaxDifference(int[] myArray, int maxDifference, int minNumber) {
		for(int i = 1; i < myArray.length; i++) {
			maxDifference = Math.max(maxDifference, myArray[i]-minNumber);
			minNumber = Math.min(minNumber, myArray[i]);
		}

		return maxDifference;
	}
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {2,3,10,6,4,8,1};
		System.out.println("The original Array was:");
		printArray(myArray);
		
		int maxDifference = myArray[1] - myArray[0];
		int minNumber = myArray[0];
		
		System.out.println(findMaxDifference(myArray,maxDifference,minNumber));
		
		
	}

}
