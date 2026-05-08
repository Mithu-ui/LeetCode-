class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int faaa=0;
        while(temp>0){
            faaa=faaa*10+temp%10;
            temp=temp/10;
        }
        return Math.abs(faaa-n);
    }
}