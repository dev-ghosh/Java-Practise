package Array2D;
import java.util.Scanner;
public class Qrotate90matrix {
    static void printmatrix(int [][]  matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void inplace(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){ // instead of 0 i is written otherwise the lower triangular matrix will not be swapped
                //swap matrix[i][j] with matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverse_array(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][]matrix,int n){
        // transpose
        inplace(matrix,n,n); // r,c = n,n coz given square matrix
        // reverse the transpose
        for(int i=0;i<n;i++){
        reverse_array(matrix[i]); //matrix[i] is 1D array
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalelements=r*c;
        System.out.println("enter " + totalelements + " values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printmatrix(matrix);

        rotate(matrix,r);

        System.out.println("rotation of matrix");
        printmatrix(matrix);
    }

}
