package Array2D;
import java.util.Scanner;
public class Initialize {
    // how to print
    static void printarray(int[][]arr){
        for(int i=0;i<arr.length;i++){ //rows
            for(int j=0;j<arr[i].length;j++){ //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows");
        int r=sc.nextInt();
        System.out.println("enter no of columns");
        int c=sc.nextInt();
        int[][] arr=new int[r][c]; //tottal=r*c
        System.out.println("enter elements");
        //how to input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }


//        int[][]arr2={{1,2,3},{3,4,5},{6,7,8}};

        printarray(arr);

    }
}
