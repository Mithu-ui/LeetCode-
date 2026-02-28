class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left=1,high=x/2;
        while(left<=high){
           int mid=(left+high)/2;
           if(mid==x/mid){
            return mid;
           } else if(mid>x/mid){
            high=mid-1;
           }else{
            left=mid+1;
           }
        }
        return high;
    }
}