class Solution {
    private List<Integer> helper(int num,List<Integer> prev){
        List<Integer> res=new ArrayList<>();
        res.add(1);
        if(num==1) return res;
        int n=prev.size();
        for(int i=1;i<n;i++){
            res.add(prev.get(i)+prev.get(i-1));
        }
        res.add(1);
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            if(i==1) result.add(helper(i,new ArrayList<>()));
            else{
                List<Integer> prev=result.get(i-2);
                List<Integer> temp=helper(i,prev);
                result.add(temp);
            }
        }
        return result;
    }
}