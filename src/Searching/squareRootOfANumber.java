package Searching;

public class squareRootOfANumber {
	
	public static int findSquareRoot(int x) {
		int low = 1;
		int high = x;
		
		int answer = 0;
		
		while(low <= high) {
			int temp = low + high;
			int mid = temp/2;
			if(mid*mid == x) {
				return mid;
			} else if(mid*mid > x) {
				high=mid-1;
				answer = mid-1;
			} else {
				low=mid+1;
				
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 29;
		int result = findSquareRoot(x);
		System.out.print("The result of the square root is:" +result);
	}

}
