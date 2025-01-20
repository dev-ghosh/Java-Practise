package BinarySearch.RotatedSortedArray;

public class PivotIndex {
    static int findmin(int [] a){
        int n=a.length;
        int start=0;
        int end=a.length-1;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(a[mid]<=a[n-1]){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a ={3,4,5,1,2};
        System.out.println(findmin(a));
    }
}
