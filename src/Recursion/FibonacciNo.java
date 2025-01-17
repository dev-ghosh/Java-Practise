package Recursion;

public class FibonacciNo {
    static int fib(int n){
        if(n==0 || n==1) return n; // base case
        //sub problem
        int prev=fib(n-1);
        int prevprev=fib(n-2);
        //self workk
        return prev+prevprev;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
