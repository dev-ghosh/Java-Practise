package Recursion;

public class TargetX {
    static boolean search(int[] a,int n ,int target, int idx){
    // base case
        if(idx>=a.length) return false;
        //self work
        if(a[idx]==target) return true;
        //sub work
        if(search(a,n,target,idx+1)) return true;
        else return false;
    }
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int target=4;
        if(search(a,target,a.length,0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
