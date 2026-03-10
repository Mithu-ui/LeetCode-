class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Brute-force approach to solve this problem.
        // int max=Arrays.stream(temperatures).max().getAsInt();
        // for(int i=0;i<temperatures.length;i++){
        //     int count=0;
        //     boolean res=false;
        //     if(max!=temperatures[i]){
        //         for(int j=i+1;j<temperatures.length;j++){
        //             if(temperatures[j]>temperatures[i]){
        //                 res=true;
        //                 count++;
        //                 break;
        //             }else{
        //                 count++;
        //             }
        //         }
        //         if(res){
        //             temperatures[i]=count;
        //         }else{
        //             temperatures[i]=0;
        //         }
        //     }else{
        //         temperatures[i]=0;
        //     }
        // }
        // return temperatures;
        //Optimal way to solve this problem
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prev = stack.pop();
                answer[prev] = i - prev;
            }
            stack.push(i);
        }
        return answer;
    }
}