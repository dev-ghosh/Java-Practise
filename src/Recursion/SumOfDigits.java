package Recursion;

public class SumOfDigits {
    static int sod(int n){
        if(n>=0 && n<=9) return n; // base case
        //sub work
        int smallans=sod(n/10);
        //self work
        int ans =smallans+n%10;
        return ans ;

        // in single line
        // return sod(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
}
