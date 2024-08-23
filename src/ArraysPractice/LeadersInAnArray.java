package ArraysPractice;

public class LeadersInAnArray {
	
	public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
		System.out.println();
	}
	
	//1st Logic
//	public static void printLeaders(int[] arr) {
//		for(int i = 0; i < arr.length-1; i++) {
//			boolean	flag = false;
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] <= arr[j]) {
//					flag = true;
//				}
//			}
//			if(flag == false) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//		System.out.print(arr[arr.length-1]);
//	}
	
//	2nd logic
	public static void printLeaders(int[] arr) {
		int currentLeader = arr[arr.length-1];
		System.out.print(currentLeader + " ");
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] > currentLeader) {
				currentLeader = arr[i];
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] initialArray = {7,10,4,10,6,5,2};
		System.out.println("The initial Array is:");
		printArray(initialArray);
		printLeaders(initialArray);
		
	}

}
