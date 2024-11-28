package GFG;
import java.util.Scanner;
public class q1 {
    public static int typeCast(double d){
        // code here
        return (int) d;
    }
// printing the integer value of decimal part
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double d;
       d=sc.nextDouble();
        System.out.println(typeCast(d));
        typeCast(d);
    }
}
