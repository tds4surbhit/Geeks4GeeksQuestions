package Sorting;

public class CountInversion_in_Array {
	
//	public static int countingFunction(int[] arr, int l, int m, int r) {
//		
//	}
	
	public static int countNumberOfInversions(int[] arr, int l , int r) {
		int result = 0;
		if(r>l) {
			int m = l + (r-l)/2;
			result = result + countNumberOfInversions(arr,l,m);
			result = result + countNumberOfInversions(arr,m+1,r);
//			result = result + countingFunction(arr,l,m,r);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,8,11,6,9,3,13};
		int l = 0;
		int r = arr.length-1;
		countNumberOfInversions(arr,l,r);
		
		
		
	}

}
