class Solution {
    private int prev;
    private int BinarySearch(int []nums,int target,int low,int high){
        int mid=(low+high)/2;
        if(low<=high){
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) return BinarySearch(nums,target,mid+1,high);
            if(nums[mid]>target)  return BinarySearch(nums,target,low,mid-1);
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        if(nums[n-1]<target) return n;
        if(nums[0]>target) return 0;
        return BinarySearch(nums,target,0,n-1);
    }
}