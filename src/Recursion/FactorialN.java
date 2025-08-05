package Recursion;
import java.util.Scanner;
public class FactorialN {
    static int factorial(int n){
       if(n==0) return 1; // base case
//        //recursive work/sub problem
//        int smallans=factorial(n-1);
//        //self workkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
//        int ans=n*smallans;
//        return ans;
        // OR
        return n*factorial(n-1); // n is self n-1 is sub work
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n : ");
        int n=sc.nextInt();
        System.out.println(factorial(n));
       // instead of import it can be sout(factorial(5));
    }
}
