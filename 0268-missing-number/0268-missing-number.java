class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            if(count!=nums[i]){
                return count;
            }
            count++;
        }
        return n;
    }
}