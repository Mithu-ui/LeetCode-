class Solution {
    static int dp[];
    private int fibo_memo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n-1]!=-1) return dp[n-1];
        return dp[n-1]=fibo_memo(n-1)+fibo_memo(n-2);
    }
    public int fib(int n) {
        dp=new int[n];
        Arrays.fill(dp,-1);
        return fibo_memo(n);
    }
}