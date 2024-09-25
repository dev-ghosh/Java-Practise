package NumberSystem;
import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimalnum= sc.nextInt();
        int ans=0; // converted binary num
        int n=1; // n is power of 10
        while(decimalnum>0){
            int parity=decimalnum%2;
            ans+=(parity*n);
            n*=10;
            decimalnum/=2;
        }
        System.out.println(ans);
    }
}
