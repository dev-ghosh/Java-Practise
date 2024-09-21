package BasicsOfJava;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
public class ExampleRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dividend : ");
        int a = sc.nextInt();
        System.out.println("enter divisor :");
        int b= sc.nextInt();
        int q=a/b;
        int r=a-b*q; //or a%b; this is modulo operator
        System.out.println("remainder when "+a+" is divided by "+b+" is "+r);
    }
}
