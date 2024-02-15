package TwoDArrays;

public class TransposeOfTheMatrix {

    public static void print2DArray(int[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr,int i, int j){
        int temp = arr[j][i];
        arr[j][i] = arr[i][j];
        arr[i][j] = temp;
    }

    public static void printTransponseOfMatric(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[i].length; j++){
                swap(arr,i,j);
            }
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10},{13,14,15}};
        printTransponseOfMatric(arr);
        print2DArray(arr);
    }


}
