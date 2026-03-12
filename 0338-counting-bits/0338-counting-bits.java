class Solution {
    public int[] countBits(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<=n;i++){
            int temp=i,count=0;
            while(temp>0){
               temp=temp&(temp-1);
               count++;
            }
            dp[i]=count;
        }
        return dp;
    }
}