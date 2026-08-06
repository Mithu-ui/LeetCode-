class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        x=0
        y=len(nums)-1
        count=0
        while x <= y:
            while y >= 0 and nums[y] == val:
                y -= 1
            while x <= y and nums[x] != val:
                count += 1
                x += 1
            while x<=y and nums[x]==val and nums[y]!=val:
                nums[x],nums[y]=nums[y],nums[x]
                x,y=x+1,y-1
                count += 1
        return count
