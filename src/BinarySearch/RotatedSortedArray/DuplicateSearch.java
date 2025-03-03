package BinarySearch.RotatedSortedArray;

public class DuplicateSearch {
    static int search(int[]a,int target){

        int n=a.length;
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target) return mid;
            else if(a[start]==a[mid]&& a[end]==a[mid]){ // 1st change
                start++;
                end--;
            }
            else if(a[mid]<=a[end]){ // 2nd change = added
                if(target>a[mid] && target<=a[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>=a[start] && target<a[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    int[]a ={1,1,1,1,2,2,3,1};
    int target=2;
        System.out.println(search(a,target));
    }
}
