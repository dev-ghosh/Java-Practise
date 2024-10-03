package JavaMethods;
import java.util.Scanner;
    class algebra{
        int add(int a,int b){
            int ans =a+b;
            return ans;
        }
    }
public class Algebra  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        algebra obj=new algebra();
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("the sum is ");
         int ans =obj.add(x,y);
        System.out.println(ans);

    }
}
