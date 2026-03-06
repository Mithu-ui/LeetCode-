class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k == 0) return;
        k = k % nums.length;

        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length -1);
    }

    public void reverse(int[] nums, int start, int end){
        while(end > start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
}