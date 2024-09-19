package BasicsOfJava;
import java.util.Scanner; //new thing added
public class InputTaking {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); //new thing
        int radius;
        radius=sc.nextInt(); //new thing
        double pi=3.14;
        double area= pi*radius*radius;
        System.out.println("the area of circle is "+area);
    }
}
