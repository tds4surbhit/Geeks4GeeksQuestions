package TwoDArrays;

public class MatrixInSnakePattern {

    public static void printSnakePattern(int[][] arr){
        int c = arr[0].length;
        int r = arr.length;

        for(int i = 0 ; i < arr.length ; i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < arr[i].length; j++){
                    System.out.println(arr[i][j]);
                }
            } else {
                for(int j = arr.length-1; j >= 0 ; j--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] agrs){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSnakePattern(arr);


    }
}
