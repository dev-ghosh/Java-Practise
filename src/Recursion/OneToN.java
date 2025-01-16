package Recursion;
import java.util.Scanner;
public class OneToN {
     static void printinc(int n){
        if(n==1){                 // protects stack overflow // base case
            System.out.println(1);
            return ;
        }
        printinc(n-1); // 1,2,3....n-1,n //  recursive work/sub work
         System.out.println(n); // self workk
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number n : ");
    int n=sc.nextInt();
    printinc(n);

    }
}
