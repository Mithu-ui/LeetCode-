class Solution {
    public int firstUniqChar(String s) {
        int i=0;
        String rep="";
        while(i<s.length()){
            if(!s.substring(i+1).contains(String.valueOf(s.charAt(i))) && !rep.contains(String.valueOf(s.charAt(i)))){
                return i;
            }else{
                rep+=String.valueOf(s.charAt(i));
            }
            i++;
        }
        return -1;
    }
}