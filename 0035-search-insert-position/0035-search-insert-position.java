class Solution {
    private int helper(int []arr,int target, int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) return helper(arr,target,mid+1,high);
            if(arr[mid]>target) return helper(arr,target,low,mid-1);
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
}