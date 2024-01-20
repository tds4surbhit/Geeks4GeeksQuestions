package Searching;

public class searchInInfiniteSortedArray {
	
	public static int binarySearchExample(int[] arr, int x, int low, int high) {
		if(low > high) {
			return -1;
		}
		
		int temp = low + high;
		int mid = temp/2;
		
		if(arr[mid] == x) {
			return mid;
		} else if(arr[mid] > x) {
			return binarySearchExample(arr, x, low , mid-1);
		} else {
			return binarySearchExample(arr, x, mid+1, high);
		}
				
	}
	
	public static int searchInInfiniteArray(int[] arr, int x) {
		if(arr[0] == x) {
			return 0;
		}
		int i = 1;
		while(arr[i] < x) {
			i = i * 2;
		}
		System.out.println("The Ith param is " +i);
		int answer = binarySearchExample(arr,x,i/2,i);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,10,15,20,40,80,90,100,120,500};
		int x = 100;
		int result = searchInInfiniteArray(arr,x);
		System.out.println("Result here:" +result);
		
	}

}
