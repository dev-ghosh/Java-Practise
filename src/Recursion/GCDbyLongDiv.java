package Recursion;

import java.util.Scanner;

public class GCDbyLongDiv {
    static int gcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x : ");
        int x=sc.nextInt();
        System.out.println("enter y : ");
        int y=sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
