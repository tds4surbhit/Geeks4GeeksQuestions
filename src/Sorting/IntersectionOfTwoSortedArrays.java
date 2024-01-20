package Sorting;

public class IntersectionOfTwoSortedArrays {

	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void intersectionOfTwoSortedArrays(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		while(i < a.length && j < b.length) {
			if(i > 0 && a[i]==a[i-1]){
				i++;
				continue;
			}
			if(a[i] > b[j]) {
				j++;
			} else if(a[i] < b[j]){
				i++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,10,10,10,15,15,20};
		int[] b = {5,20,20,20};
		System.out.println("Hi");
		
		intersectionOfTwoSortedArrays(a,b);
	}

}
