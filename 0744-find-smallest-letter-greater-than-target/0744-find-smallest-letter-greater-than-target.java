class Solution {
    private int binarySearch(char[] letters,char target,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(letters[mid]==target) {
                int temp=mid;
                while(letters[temp]==letters[mid] && temp<letters.length-1 ){
                    temp=temp+1;
                }
                if(temp<letters.length-1) return temp;
                if(temp<letters.length && letters[temp]!=target) return temp;
                return 0;
            }
            if(letters[mid]<target) return binarySearch(letters,target,mid+1,high);
            if(letters[mid]>target) return binarySearch(letters,target,low,mid-1);
        }
        if(low>0 && low<letters.length) return low;
        return 0;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int idx=binarySearch(letters,target,0,letters.length-1);
        System.out.println(idx);
        return letters[idx];
    }
}