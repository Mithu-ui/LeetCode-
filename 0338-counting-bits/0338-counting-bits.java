class Solution {
    public int[] countBits(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=0;i<=n;i++){
            int temp=i,count=0;
            while(temp>0){
                if(temp%2==1){
                    count++;
                }
                temp=temp/2;
            }
            dp[i]=count;
        }
        return dp;
    }
}