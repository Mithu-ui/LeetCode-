class Solution {
    private int max(int a,int b){
        return (a>b)?a:b;
    }
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
            ans=max(ans, n.charAt(i)-'0');
            if (ans==9) break;
        }
        return ans;
    }
}