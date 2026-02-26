class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> keys=new ArrayList<>(map.keySet());
        List<Integer> values=new ArrayList<>(map.values());
        int idx=values.indexOf(1);
        return keys.get(idx);
    }
}