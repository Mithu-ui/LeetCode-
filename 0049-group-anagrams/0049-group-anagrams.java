class Solution {
    private boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char []arr1=str1.toCharArray();
        char []arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<Integer,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            if(map.size()==0){
                List<String> lis=new ArrayList<>();
                lis.add(strs[i]);
                map.put(1,lis);
            }else{
                boolean check=false;
                for(int x=1;x<=map.size();x++){
                    if(isAnagram(map.get(x).get(0),strs[i])){
                        List<String> sil=map.get(x);
                        sil.add(strs[i]);
                        map.put(x,sil);
                        check=true;
                    }
                }
                if(!check){
                List<String> lis=new ArrayList<>();
                lis.add(strs[i]);
                map.put(map.size()+1,lis);
                }
            }
        }
        for(int x=1;x<=map.size();x++){
            result.add(map.get(x));            
        }
        return result;
    }
}