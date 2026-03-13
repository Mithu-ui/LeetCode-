class Solution {
    static int dp[];
    private static int robHelp(int[] nums, int i){
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[1], nums[0]);
        if(dp[i]!=-1) return dp[i];
        return dp[i] = Math.max(robHelp(nums, i-2) + nums[i], robHelp(nums, i-1));
        
    }
    public int robber(int[] nums) {
      int n = nums.length;
      dp = new int[n+1];
      Arrays.fill(dp, -1);
      return robHelp(nums, n-1);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[1], nums[0]);
        int arr1[]=new int[nums.length-1];
        int arr2[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i+1];
        }
        return Math.max(robber(arr1),robber(arr2));
    }
}