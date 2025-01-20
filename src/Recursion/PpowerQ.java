package Recursion;

public class PpowerQ {
    static int power(int p,int q){
        if(q==0) return 1; // base case
        int smallans=power(p,q-1); // sub work
        return smallans*p; // self work
    }
    public static void main(String[] args) {
        System.out.println(power(5,4));
    }
}
