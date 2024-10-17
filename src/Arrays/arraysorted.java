package Arrays;

public class arraysorted {
    static boolean issorted(int[]arr){
        boolean check=true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                //not sorted
                check=false;
                break;
            }
        }
        return check;
    }
}
