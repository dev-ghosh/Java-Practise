package Loops;
import java.util.Scanner;
public class Qnoofdigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int org=n; //n is 0 therefore stored in org
        int noofdigits=0;
        while(n>0){
            n=n/10;
            noofdigits++;
        }
        System.out.println("no of digits in " +org+ " is " +noofdigits);
    }
}
