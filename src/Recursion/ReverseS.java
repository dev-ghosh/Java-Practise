package Recursion;

import java.util.Scanner;

public class ReverseS {
    static String reverse(String s,int idx){
        if(idx==s.length()) return " "; // base case
        // recursive work
        String smallans=reverse(s,idx+1); //e d c b
        //self work
        return smallans+s.charAt(idx);  // e d c b a
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(reverse(s,0));
    }
}
