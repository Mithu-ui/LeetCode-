class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = 0, j = 0;
        while(i < m) {
            if (j == n )break ;
            if(nums1[i] > nums2[j]) {
                for (int k = m-1; k>=i ; k--) {
                    nums1[k + 1] = nums1[k] ;
                }
                nums1[i] = nums2[j];
                m++ ;
                j++;
            }
            i++ ;
        }
        if(j < n) {
            while(i != nums1.length) {
                nums1[i++] = nums2[j++] ;
            }
        }
    }
}