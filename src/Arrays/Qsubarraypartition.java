package Arrays;
import java.util.Scanner;
public class Qsubarraypartition {
    static int arraysum(int []arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean equalpartition(int []arr){
        int totalsum=arraysum(arr);

        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            int suffixsum=totalsum-prefixsum;
            if(suffixsum==prefixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter " + n + "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("equal partition possible: " + equalpartition(arr) );
    }
}
