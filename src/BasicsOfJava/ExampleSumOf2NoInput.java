package BasicsOfJava;
import java.util.Scanner;
public class ExampleSumOf2NoInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("first no :");
        int x= sc.nextInt();
        System.out.println("second no :");
        int y= sc.nextInt();
        int sum=x+y;
        System.out.println("sum is : "+sum);

    }
}
