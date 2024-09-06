package ArraysPractice;

import java.sql.Array;
import java.util.Arrays;

public class ContainerWithMostWater {

    //brute force implementation
    public static  int maxArea(int[] height) {
        int minInteger = Integer.MIN_VALUE;
        for(int i = 0; i < height.length - 1 ; i++){
            for(int j = i+1 ; j < height.length; j++){
                int area = (j-i) * Math.min(height[i], height[j]);
                if(minInteger < area){
                    minInteger = area;
                }
            }
        }
        return minInteger;
    }

    public static void main(String[] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
}
