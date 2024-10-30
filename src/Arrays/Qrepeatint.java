package Arrays;

import java.util.Scanner;

public class Qrepeatint {
    static int repeatingint(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){ //found answer
                    return arr[i]; //no loop will work after this
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("enter " + n + "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("first repeating no: " +repeatingint(arr));

    }
}
