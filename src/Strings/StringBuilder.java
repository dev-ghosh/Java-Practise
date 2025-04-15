package Strings;
import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder str= new java.lang.StringBuilder("hello");
        //to join/add things
        str.append("world");
        System.out.println(str);
        // hello to mello
        str.setCharAt(0,'m');
        System.out.println(str);
        // hello to heyllo
        str.insert(2,'y');
        System.out.println(str);
        //heyllo to eyllo
        str.deleteCharAt(0);
        System.out.println(str);
        //to reverse
        java.lang.StringBuilder gtr=new java.lang.StringBuilder("devghosh");
        gtr.reverse();
        System.out.println(gtr);
        //to deleter from a i index to j index
        gtr.delete(0,4);
        System.out.println(gtr);
    }
}
