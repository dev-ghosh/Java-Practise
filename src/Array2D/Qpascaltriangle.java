package Array2D;
import java.util.Scanner;
public class Qpascaltriangle {
    static void printmatrix(int [][]  matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int[][] ans=new int[n][]; // col is not fixed // ans is the extra array
        for(int i=0;i<n;i++){
            // ith row has i+1 cols
            ans[i]=new int[i+1];
            //1st and last elements of every row is 1
            ans[i][0]=ans[i][i]=1;
            //p[i][j]=...
            for(int j=1;j<n;j++){ //started from 1 as in above line 0 is already fixed
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n : ");
        int n= sc.nextInt();
        int [][] ans =pascal(n);
        printmatrix(ans);
    }
}
