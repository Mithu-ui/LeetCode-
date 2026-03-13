class Solution {
    private static int dp[];
    private static int robHelp(int[] nums, int i){
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[1], nums[0]);
        if(dp[i]!=-1) return dp[i];
        dp[i] = Math.max(robHelp(nums, i-2) + nums[i], robHelp(nums, i-1));
        return dp[i];
    }
    public int rob(int[] nums) {
      int n = nums.length;
      dp = new int[n+1];
      Arrays.fill(dp, -1);
      return robHelp(nums, n-1);
    }
}