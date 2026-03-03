class Solution { 
    private ArrayList<ArrayList<Integer>> horizantal_and_vertical(int[][] image, int sr, int sc, int color){
        ArrayList<ArrayList<Integer>> horiz=new ArrayList<>();
        if(sc-1>=0 && image[sr][sc-1]==color){
            ArrayList<Integer> lis=new ArrayList<>();
            lis.add(sr);
            lis.add(sc-1);
            horiz.add(lis);
        }
        if(sc+1<image[0].length && image[sr][sc+1]==color){
            ArrayList<Integer> lis=new ArrayList<>();
            lis.add(sr);
            lis.add(sc+1);
            horiz.add(lis);
        }
        if(sr-1>=0 && image[sr-1][sc]==color){
            ArrayList<Integer> lis=new ArrayList<>();
            lis.add(sr-1);
            lis.add(sc);
            horiz.add(lis);
        }
        if(sr+1<image.length && image[sr+1][sc]==color){
            ArrayList<Integer> lis=new ArrayList<>();
            lis.add(sr+1);
            lis.add(sc);
            horiz.add(lis);
        }
        return horiz;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==0){
            return image;
        }
        int[][] res=new int[image[0].length][image.length];
        ArrayList<ArrayList<Integer>> visited=new ArrayList<>();
        int prev=0;
        ArrayList<Integer> lis=new ArrayList<>();
        lis.add(sr);
        lis.add(sc);
        visited.add(lis);
        while(visited.size()!=prev){
            prev=visited.size();
            for(int i=0;i<visited.size();i++){
                ArrayList<ArrayList<Integer>> hor=horizantal_and_vertical(image,visited.get(i).get(0),visited.get(i).get(1),image[sr][sc]);
                for(int x=0;x<hor.size();x++){
                    if(!visited.contains(hor.get(x))){
                        visited.add(hor.get(x));
                    }
                }
            }
        }
        for(int i=0;i<visited.size();i++){
            int s=visited.get(i).get(0),c=visited.get(i).get(1);
            image[s][c]=color;
        }
        return image;
    }
}