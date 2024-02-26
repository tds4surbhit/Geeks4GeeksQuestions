package TwoDArrays;

public class FindTheElement {

    public static void findTheIndexOfTheElement(int[][] arr, int x){
        int i = 0;
        int j = arr[0].length - 1;
        while(i < arr.length && j >= 0){
            if(arr[i][j] == x){
                System.out.print("The Element is found at :" +i + "and " + j + "th location");
                return;
            } else if (arr[i][j] > x){
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Number not found");
    }

    public static void main(String[] args){
        int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x = 37;
        findTheIndexOfTheElement(arr,x);
    }
}
