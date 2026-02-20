class Solution {
    private int max(int a,int b){
        return (a>b)?a:b;
    }
    public int maxProfit(int[] prices) {
        int profit=0,buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                profit=max(profit,prices[i]-buy);
            }else{
                buy=prices[i];
            }
        }
        return profit;
    }
}