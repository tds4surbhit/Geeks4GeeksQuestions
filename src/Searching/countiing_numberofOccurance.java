package Searching;

public class countiing_numberofOccurance {
	
	public static int get1stElement(int[] arr, int x) {
		return -1;
		//Write correct logic here
	}
	
	public static int findLastElement(int[] arr, int x) {
		return -1;
		//Write correct logic here
	}
	
	public static int countOccurance(int[] arr, int x) {
		// let us suppose we have a method for finding 1st and last index of an array.
		// To find 1st element - get1stElement()
		// To find Last element - getLastElement()
		
		if(get1stElement(arr,x) == -1) {
			return 0;
		}
		
		int startingIndex = get1stElement(arr,x);
		int lastIndex = findLastElement(arr,x);
		
		int answer = startingIndex - lastIndex + 1;
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,10,10,10,10,20,20};
		int x = 10;
		
		int result = countOccurance(arr,x);
		System.out.println("The result here is: " +result);
	}

}
