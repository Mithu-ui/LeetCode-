class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result=[]
        for i in range(len(nums)):
            temp=0
            for j in range(0,i+1):
                temp+=nums[j]
            result.append(temp)
        return result
        