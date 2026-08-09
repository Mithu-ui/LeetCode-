class Solution(object):
    def shift_and_add(self,nums,num,idx):
        for x in range(len(nums)-1,idx,-1):
            nums[x]=nums[x-1]
        nums[idx]=num
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = 0
        j = 0

        while i < m and j < n:

            if nums2[j] <= nums1[i]:
                self.shift_and_add(nums1, nums2[j], i)
                j += 1
                m += 1

            i += 1

        while j < n:
            nums1[i] = nums2[j]
            i += 1
            j += 1