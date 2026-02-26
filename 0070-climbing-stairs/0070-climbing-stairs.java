class Solution {
    public int climbStairs(int n) {
        int a=1,b=1,temp=0;
        for(int i=0;i<n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return a;
    }
}