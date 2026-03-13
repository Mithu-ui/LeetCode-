class Solution {
    static int dp[];
    // private int climb(int n){
    //     if(n==1) return 1;
    //     if(n==2) return 2;
    //     if(dp[n-1]!=-1) return dp[n-1];
    //     return dp[n-1]=climb(n-1)+climb(n-2);
    // }
    public int climbStairs(int n) {
        // dp=new int[n];
        // Arrays.fill(dp,-1);
        // return climb(n);
        if(n==1) return 1 ;
        if(n==2) return 2;
        int[] dp=new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}