class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length,count=0;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    ArrayList<Integer> lis=new ArrayList<>();
                    lis.add(i);
                    lis.add(j);
                    list.add(lis);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            boolean isvalid=true;
            int x=list.get(i).get(0);
            int y=list.get(i).get(1);
            for(int r=0;r<m;r++){
                if(r!=x && mat[r][y]==1){
                    isvalid=false;
                }
                if(!isvalid){
                    break;
                }
            }
            if(!isvalid){
                    continue;
            }
            for(int r=0;r<n;r++){
                if(r!=y && mat[x][r]==1){
                    isvalid=false;
                }
                if(!isvalid){
                    break;
                }
            }
            if(isvalid){
                count++;
            }
        }
        return count;
    }
}