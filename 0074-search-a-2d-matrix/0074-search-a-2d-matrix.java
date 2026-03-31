class Solution {
    private boolean isFound(int []arr,int target,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]<target) return isFound(arr,target,mid+1,high);
            if(arr[mid]>target) return isFound(arr,target,low,mid-1);
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length,n=mat[0].length;
        int m1=0,m2=m-1;
        while(m1<=m2){
            int mid_m=(m1+m2)/2;
            if(mat[mid_m][0]<=target && mat[mid_m][n-1]>=target){
                return isFound(mat[mid_m],target,0,n-1);
            }
            else if(mat[mid_m][0]>target){
                m2=mid_m-1;
            }
            else{
                m1=mid_m+1;
            }

        }
        return false;
    }
}