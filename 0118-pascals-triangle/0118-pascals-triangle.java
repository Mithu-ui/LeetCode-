class Solution {
    public List<Integer> prev(List<Integer> list){
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        for(int i=1;i<list.size();i++){
           list1.add(list.get(i)+list.get(i-1)); 
        } 
        list1.add(1);
        return list1;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> op=new ArrayList<>();
        if(numRows==0){return op;}
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        op.add(list1);
        if(numRows==1){
            return op;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> lis=prev(op.get(i-1));
            op.add(lis);
        }
        return op;
    }
}