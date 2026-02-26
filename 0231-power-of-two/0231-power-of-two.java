class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        int m=n&(n-1);
        return m==0;
    }
}