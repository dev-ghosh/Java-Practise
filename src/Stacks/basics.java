package Stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        //int[] arr=new int[5];
        Stack<Integer> st=new Stack<>(); //empty
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5); // on top

        System.out.println(st.peek()); //will show top element
        System.out.println(st); // to print
        st.pop(); // removes top element
        System.out.println(st);
        System.out.println("size is : "+st.size());
        //to print the first element
//        while(st.size()>1){
//            st.pop();
//        }
//        System.out.println(st.peek());
//        System.out.println(st);
    }
}
