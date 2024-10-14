package Arrays;
import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args) {
        //to take input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " + n + " elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //now to print
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
