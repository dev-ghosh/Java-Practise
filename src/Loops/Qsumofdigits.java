package Loops;
import java.util.Scanner;
public class Qsumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int org=n; //n is 0 therefore stored in org
        int sumofdigits=0;
        while(n>0){
            sumofdigits+=n%10;
            n=n/10;
        }
        System.out.println("sum of digits in " +org+ " is " +sumofdigits);
    }
}
