package Recursion;
import java.util.Scanner;
public class NumAndK {
    static void printmultiples(int n,int k){
        // base case
        if(k==0) return ;
        if(k==1){
            System.out.println(n);
            return ;
        }
        //sub work
        printmultiples(n,k-1);
        //self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
        int n=sc.nextInt();
        System.out.println("enter k :  ");
        int k=sc.nextInt();
        printmultiples(n,k);
    }
}
