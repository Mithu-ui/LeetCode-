class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
       ArrayList<Integer> row=new ArrayList<>();
       ArrayList<Integer> col=new ArrayList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                row.add(i);
                col.add(j);
            }
        }
       } 
       for(int i=0;i<row.size();i++){
        int x=row.get(i),y=col.get(i);
        for(int j=0;j<m;j++){
            matrix[x][j]=0;
        }
        for(int j=0;j<n;j++){
            matrix[j][y]=0;
        }
       }
    }
}