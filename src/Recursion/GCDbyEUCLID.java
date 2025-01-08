package Recursion;

import java.util.Scanner;

public class GCDbyEUCLID {
    static int gcd(int x,int y){
        if(y==0) return x; // base case
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x : ");
        int x=sc.nextInt();
        System.out.println("enter y : ");
        int y=sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
