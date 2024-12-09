package Array2D;
import java.util.Scanner;
public class Qspiralmatrix {
    static void printmatrix(int [][]  matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 1 2 3 4 5
    // 6 7 8 9 10
    // 11 12 13 14 15
    // 16 17 18 19 20
    // 21 22 2 3 24 25
    static void spiralorder(int[][]matrix,int r,int c){
    int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
    int totalelements=0;
    while(totalelements<r*c){
        //toprow=leftcol to rightcol
        for(int j=toprow;j<=rightcol;j++){
            System.out.print(matrix[toprow][j] + " ");
            totalelements++;
        }
        toprow++; //5 will not be printed twice
        //rightcol=toprow to bottomrow
        for(int i=toprow;i<=bottomrow;i++){
            System.out.print(matrix[i][rightcol] + " ");
            totalelements++;
        }
        rightcol--; //25 will not print twice
        //bottomrow=rightcol to left col
        for(int j=rightcol;j>=leftcol;j--){
            System.out.print(matrix[bottomrow][j] + " ");
            totalelements++;
        }
        bottomrow--; //21 will not print twice
        //leftcol=bottomrow to toprow
        for(int i=bottomrow;i>=toprow;i--){
            System.out.print(matrix[i][leftcol] + " ");
            totalelements++;
        }
        leftcol++; // 1 will not print twice
    }
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("enter rows and columns : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int total=r*c;
        System.out.println("enter " + total + " elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printmatrix(matrix);

        System.out.println("spiral order");
        spiralorder(matrix,r,c);
    }
}
