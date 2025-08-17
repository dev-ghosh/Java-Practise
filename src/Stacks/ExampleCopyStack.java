package Stacks;

import java.util.Stack;
import java.util.Scanner;
public class ExampleCopyStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st =new Stack<>();
        //taking input from user
//        int n;
//        System.out.println("enter number of elements : ");
//        n=sc.nextInt();
//        System.out.println("enter elements : ");
//        for(int i=1;i<=n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
       // System.out.println(gt); this is the reversed order
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
