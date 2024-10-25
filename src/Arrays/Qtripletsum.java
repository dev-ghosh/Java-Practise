package Arrays;
import java.util.Scanner;
public class Qtripletsum {
    static int triplesum(int[] arr,int target){
        int ans =0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){ //for 1st no
                for(int k=j+1;k<n;k++){ //for 2nd no
                    if(arr[i]+arr[j]+arr[k]==target){ //for 3rd no
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter target sum");
        int target = sc.nextInt();

        System.out.println(triplesum(arr,target));
    }
}

