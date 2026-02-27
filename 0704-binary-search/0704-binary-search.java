class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    private int binarySearch(int[] arr,int target,int low,int high){
        int mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        if( arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            low=mid+1;
            return binarySearch(arr,target,low,high);
        }
        else{
            high=mid-1;
            return binarySearch(arr,target,low,high);
        }
    }
}