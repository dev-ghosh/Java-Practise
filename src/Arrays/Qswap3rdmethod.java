package Arrays;

import org.w3c.dom.ls.LSOutput;

public class Qswap3rdmethod {
    public static void main(String[] args) {
        int a=10,b=20;

        a=a+b-(b=a); //single code for swap

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
