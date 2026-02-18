class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        System.out.println(map);
        ArrayList<Integer> keys=new ArrayList<>(map.keySet());
        ArrayList<Integer> values=new ArrayList<>(map.values());
               System.out.println(values);
        for(int i=0;i<values.size();i++){
            if(values.get(i)>1){
                return true;
            }
        }
        return false;
    }
}