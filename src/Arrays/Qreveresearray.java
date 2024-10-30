package Arrays;

public class Qreveresearray {
    public static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]); //ln removed
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=0,right=arr.length-1;
        System.out.println("original array");
        display(arr);
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("\nreversed array");
        display(arr);
    }
}
