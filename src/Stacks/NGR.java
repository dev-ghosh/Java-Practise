package Stacks;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class NGR {
    public static void ngr(int [] arr){
        Vector<Integer> v=new Vector<>();
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                v.add(-1);
            }
            else if(st.size()>0 && st.peek()>arr[i]){
                v.add(st.peek());
            }
            else if(st.size()>0 && st.peek()<arr[i]){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    v.add(-1);
                }
                else{
                    v.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(v);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " + n + " elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        Vector<Integer> v=new Vector<>();
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                v.add(-1);
            }
            else if(st.size()>0 && st.peek()>arr[i]){
                v.add(st.peek());
            }
            else if(st.size()>0 && st.peek()<arr[i]){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    v.add(-1);
                }
                else{
                    v.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(v);
        ngr(arr);
    }
}
