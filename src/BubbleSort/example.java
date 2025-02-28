package BubbleSort;

public class example {
    static void bubblesort(int[] a){
        int n=a.length;
        //n-1 iterations
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){ // last element is already sorted
                if(a[j]>a[j+1]){
                    //swapping
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a ={7,6,5,4,3};
        bubblesort(a);
        //to print the array
        for(int i:a){
            System.out.print(i + " "); //ln removed and space added
        }
    }
}
