package Strings;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="dev ghosh";
        //charAt
        System.out.println(str.charAt(2));
        //indexOf
        System.out.println(str.indexOf('v'));
        //compareTo
        String gtr="raman";
        System.out.println(str.compareTo(gtr));
        //contains()
        System.out.println(str.contains("hos"));
        //startsWith()
        System.out.println(str.startsWith("dev"));
        //concatenate
        String s1="abc";
        String s2="def";
        System.out.println(s1.concat(s2));
        //string+string/char/int
        String s="abc";
        s+="xyz";
        s+='r';
        s+=10;
        System.out.println("abc"+10+20);
        System.out.println("abc"+(10+20));


    }
}
