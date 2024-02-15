package TwoDArrays;

public class RotateMatrixAntiClockWiseBy90 {

    public static void swap(int[][] arr,int i, int j){
        int temp = arr[j][i];
        arr[j][i] = arr[i][j];
        arr[i][j] = temp;
    }

    public static void anotherSwapFunction(int[][] arr,int i, int j ,int i1,int j2){
        int temp = arr[i][j];
        arr[i][j] = arr[i1][j2];
        arr[i1][j2] = temp;
    }


    public static void print2DArray(int[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrixby90(int[][] arr){
        // we will first rotate matrix to make a transpose
        // Then we shall rotate the elements of the columns to get the desired result
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                swap(arr,i,j);
            }
        }

        for(int i = 0 ; i < arr.length; i++){
            int low = 0 ;
            int high = arr.length-1;
            while(low < high){
                anotherSwapFunction(arr,low,i,high,i);
                low++;
                high--;
            }

        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateMatrixby90(arr);
        print2DArray(arr);
    }
}
