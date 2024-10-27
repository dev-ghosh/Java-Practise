package Arrays;

public class Qswapno {
    static void swap(int a, int b){
        System.out.println("values before swap");
        System.out.println("a " + a);
        System.out.println("b " + b);

        int temp=a; //a=a+b
        a=b;        //b=a-b
        b=temp;     //a=a-b

        System.out.println("values after swap");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        swap(a,b);
    }
}
