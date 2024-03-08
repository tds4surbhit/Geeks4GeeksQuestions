package Hashing;

import java.util.HashSet;

public class UnionOfTwoUnSortedArrays {

    public static int findtheNumberOfElementsInTheUnion(int[] arr1, int[] arr2){
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr1){
            s.add(i);
        }
        for(int j : arr2){
            s.add(j);
        }
        return s.size();
    }

    public static void main(String[] args){
        int[] arr1 = {10,30,10,40};
        int[] arr2 = {40,5,10,15};
        int ans = findtheNumberOfElementsInTheUnion(arr1,arr2);
        System.out.println("Ans " + ans);

    }
}
