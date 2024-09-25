package NumberSystem;
import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binarynum=sc.nextInt();
        int ans=0; //converted decimal no
        int n=1; // n represents power of 2
        while(binarynum>0){
            int unitdigit=binarynum%10;
            ans+=(unitdigit*n);
            binarynum/=10;
            n*=2;
        }
        System.out.println(ans);
    }
}
