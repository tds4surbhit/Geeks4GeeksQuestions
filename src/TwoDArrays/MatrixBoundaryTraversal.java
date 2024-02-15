package TwoDArrays;

public class MatrixBoundaryTraversal {
    public static void printingSomething(int[][] arr){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[0][j]);
        }

        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i][arr[0].length-1]);
        }

        for(int k = arr[arr.length-1].length-2; k>= 0 ; k--){
            System.out.print(arr[arr.length-1][k]);
        }

        for(int l = arr.length-2; l > 0 ; l--){
            System.out.print(arr[l][0]);
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printingSomething(arr);
    }
}
