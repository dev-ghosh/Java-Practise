package SelectionSort;

public class example {
     static void selectionsort(int[] arr){
         int n=arr.length;
         for(int i=0;i<n-1;i++){ //i is the current index
             // find the min element in unsorted part of array
             int min_index=i;
             for(int j=i+1;j<n;j++){
                 if(arr[j]<arr[min_index]){
                     min_index=j;
                 }
             }
             //swap current element with min element
             int temp=arr[i];
             arr[i]=arr[min_index];
             arr[min_index]=temp;
         }
     }
    public static void main(String[] args) {
        int []arr={7,6,5,4,3};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
