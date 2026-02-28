class Solution {
    
    public int searchInsert(int[] arr, int target) {
        int low=0,high=arr.length;
        if(target>arr[high-1]){
            return high;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}