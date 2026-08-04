class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        pivot=-1
        right_sum=sum(nums)
        left_sum=0
        for i in range(len(nums)):
            if(i!=0):
                left_sum+=nums[i-1]
            right_sum-=nums[i]
            if(left_sum==right_sum):
                pivot=i
                break
        return pivot