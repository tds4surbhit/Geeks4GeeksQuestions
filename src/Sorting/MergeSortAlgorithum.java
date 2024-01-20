package Sorting;

public class MergeSortAlgorithum {
	
	public static void printArray(int[] arr) {
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void mergeFunction(int[] arr, int l , int m , int r) {
		int low = l;
		int high = r;
		int mid = m;
		
		
		// we divide the array into two parts
		int firstArrayLength = mid-low+1;
		int secoundArrayLength = high-mid;
		int[] left = new int[firstArrayLength];
		int[] right = new int[secoundArrayLength];
		
		//tricky part -->
		for(int i = 0; i < firstArrayLength; i++) {
			left[i] = arr[low+i];
		}
		
		for(int i = 0; i < secoundArrayLength; i++) {
			right[i] = arr[mid+i+1];
		}

		int i = 0;
		int j = 0;
		int key = low;
		
		while(i < mid-low+1 && j < high-mid) {
			if(left[i] <= right[j]) {
				arr[key] = left[i];
				i++;
				key++;
			} else {
				arr[key] = right[j];
				j++;
				key++;
			}
		}
		
		while(i < mid-low+1) {
			arr[key] = left[i];
			i++;
			key++;
		}
		
		while(j < high-mid) {
			arr[key] = right[j];
			j++;
			key++;
		}
		
		System.out.println("The sorted array is");
		printArray(arr);
		
	}

	public static void mergeSort(int[] arr, int l, int r) {
		if(r>l) {
			int m = l + (r-l)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			mergeFunction(arr, l , m , r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,5,30,15,7};
		int l = 0;
		int r = arr.length-1;
		mergeSort(arr,l,r);
		

	}

}
