class Solution {
    private int reverse(int num){
        int rev=0,temp=num;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x>=0 && x<10){
            return true;
        }
        return x==reverse(x);
    }
}