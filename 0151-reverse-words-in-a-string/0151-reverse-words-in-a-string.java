class Solution {
    public String reverseWords(String s) {
        String []res=s.split("\\s+");
        int i=0,j=res.length-1;
        while(j>i){
            String temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            j--;
            i++;
        }
        String sol="";
        for( i=0;i<res.length;i++){
            sol+=res[i]+" ";
        }
        return sol.trim();
    }
}