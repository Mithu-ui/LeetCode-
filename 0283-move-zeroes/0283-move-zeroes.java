class Solution {
    public int search(int []arr,int n){
        for(int i=0;i<=n;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return;
        }
        int n=nums.length-1;
         System.out.println(search(nums,n));
        while(search(nums,n)>=0 && n>0){
            int x=search(nums,n);
            for(int i=x;i<n;i++){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            n=n-1;
        }
    }
}