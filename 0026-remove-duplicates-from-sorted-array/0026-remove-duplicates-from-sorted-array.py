class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res=[]
        for i in range(len(nums)):
            if nums[i] not in res:
                res.append(nums[i])
        for i in range(len(res)):
            nums[i]=res[i]
        return len(res)