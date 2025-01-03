package Recursion;
import java.util.Scanner;
public class NtoOne {
    static void printdec(int n){
        if(n==1){   // base case
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);
        // recursive work/sub work
        printdec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n : ");
        int n=sc.nextInt();
        printdec(n);
    }
}
