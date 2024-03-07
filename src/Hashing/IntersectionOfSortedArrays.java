package Hashing;

import java.util.HashSet;

public class IntersectionOfSortedArrays {

    public static void intersectionPoint(int[] arr1, int[] arr2){
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr2){
            s.add(i);
        }
        for(int j : arr1){
            if(s.contains(j)){
                System.out.println(j + " ");
            }
        }
    }

    public static void main(String[] args){
        int arr1[] = {10,20,30};
        int arr2[] = {30,10};
        intersectionPoint(arr1,arr2);
    }
}
