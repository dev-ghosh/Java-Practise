package IfElse;
import java.util.Scanner;
public class greatestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no : ");
        int a= sc.nextInt();
        System.out.println("enter 2nd no : ");
        int b= sc.nextInt();
        System.out.println("enter 3rd no : ");
        int c= sc.nextInt();
        if(a>b && a>c) System.out.println(a+ " is largest");
        if(b>a && b>c) System.out.println(b+ " is largest");
        if(c>a && c>b) System.out.println(c+ " is largest");
    }
}
