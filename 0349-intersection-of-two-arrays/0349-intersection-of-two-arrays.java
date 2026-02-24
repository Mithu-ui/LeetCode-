class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums2.length;i++){
        if(Arrays.binarySearch(nums1,nums2[i])>-1){
            set.add(nums2[i]);
        }
       }
        int op[]=new int[set.size()],i=0;
        for(Integer s:set){
            op[i]=s;
            i++;
        }
        return op;
    }
}