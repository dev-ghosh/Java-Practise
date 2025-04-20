package Strings;
import java.lang.StringBuilder;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        for(int i=1;i<=str.length();i++){
            // P to p
            //check alphabet small or capital
            boolean flag=true; // true for capital
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97) flag=false; // small
            if(flag==true){ // capital
                ascii+=32;
                char dh =(char)ascii;
                str.setCharAt(i,dh);
            }
            else{ // for small
                ascii-=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
