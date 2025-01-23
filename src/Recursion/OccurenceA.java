package Recursion;

import java.util.Scanner;

public class OccurenceA {
    // dbacx to dbcx
    static String removeA(String s, int idx){
        // base case
        if(idx==s.length()) return " ";
        //recursive work
        String smallans=removeA(s,idx+1); // bcx
        char currentcharacter=s.charAt(idx);
        //self work
        if(currentcharacter!='a'){
            return currentcharacter+smallans; // d+ bcx
        }
        else return smallans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(removeA(s,0));
    }
}
