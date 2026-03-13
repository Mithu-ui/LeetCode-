class Solution {
    private static int dp[];
    private static int max(int a,int b){return (a>b)?a:b;}
    public int rob(int[] nums) {
       if(nums.length==1) return nums[0];
       if(nums.length==2) return max(nums[0],nums[1]);
       dp=new int[nums.length];
       dp[0]=nums[0];
       dp[1]=max(nums[0],nums[1]);
       for(int i=2;i<nums.length;i++){
        dp[i]=max(dp[i-2]+nums[i],dp[i-1]);
       }
       return dp[nums.length-1];
    }
}