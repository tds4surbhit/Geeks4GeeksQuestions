package Recursion;

import java.util.ArrayList;


public class PowerSetUsingRecursion {
    public static ArrayList<String> LexSort(String str, String ModifiedString , ArrayList<String> correctAns, int i){
        if(i == str.length()){
            correctAns.add(ModifiedString);
            return correctAns;
        }
        //function get called for inclusion -->
        LexSort(str, ModifiedString+str.charAt(i), correctAns, i+1);
        LexSort(str,ModifiedString,correctAns,i+1);
        return correctAns;
    }
    public static void main(String[] args){
        String str = "abc";
        int i = 0;
        String ModifiedString = "";
        ArrayList<String> correctAns = new ArrayList<>();
        ArrayList<String> finalAnswer = LexSort(str,ModifiedString,correctAns,i);
        for(String s : finalAnswer){
            System.out.println(s + " ");
        }
    }
}
