class Solution {
    public int max(int a,int b){
        return (a>b)?a:b;
    }
    public int min(int a,int b){
        return (a<b)?a:b;
    }
    public int trap(int[] height) {
        int n=height.length,Rwall=0,Lwall=0;
        int maxL[]=new int[n];
        int maxR[]=new int[n];
        for(int i=0;i<n;i++){
            int j=n-i-1;
            maxL[i]=max(Lwall,height[i]);
            maxR[j]=max(Rwall,height[j]);
            Lwall=max(Lwall,height[i]);
            Rwall=max(Rwall,height[j]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int pot=min(maxL[i],maxR[i]);
            sum+=max(0,pot-height[i]);
        }
        return sum;
    }
}