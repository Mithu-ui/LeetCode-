class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int []diffuse=new int[n];
        Arrays.fill(diffuse,0);
        if(k==0) return diffuse;
        else if(k>0){
            for(int i=0;i<n;i++){
                int count1=i+1,res=0;
                for(int x=0;x<k;x++){
                    if(count1>=n){
                        count1=0;
                    }
                    res+=code[count1];
                    count1++;
                }
                diffuse[i]=res;
            }
        }else{
            int m=-1*k;
            for(int i=0;i<n;i++){
                if(i-m<0){
                    int x=i-1,res=0,iter=0,temp=n-1;
                    while(x>=0 && i!=0){
                        res+=code[x];
                        iter++;
                        x--;
                    }
                    while(iter<m){
                        res+=code[temp];
                        temp--;
                        iter++;
                    }
                    diffuse[i]=res;
                }else{
                    int x=i-1,res=0,iter=0,temp=n-1;
                    while(x>=0 && iter<m){
                        res+=code[x];
                        iter++;
                        x--;
                    }
                    diffuse[i]=res;
                }
            }
        }
        return diffuse;
    }
}