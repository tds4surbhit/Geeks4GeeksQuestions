package Sorting;

public class MergeTwoSortedArray {
	
	public static void mergingTwoSortedArrays(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		while(i < a.length && j < b.length) {
			if(a[i]<=b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else {
				System.out.print(b[j] + " ");
				j++;
			}
		}
		while(i < a.length) {
			System.out.print(a[i] + " ");
			i++;
		}
		while(j < b.length) {
			System.out.print(b[j] + " ");
			j++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,50};
		int[] b = {5,50,50};
		
		mergingTwoSortedArrays(a,b);
		
		
		
		

	}

}
