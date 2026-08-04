class Solution(object):
    def largestAltitude(self, gain):
        """
        :type gain: List[int]
        :rtype: int
        """
        highest_altitude=-1*float('inf')
        sum=0
        for i in range(len(gain)):
            highest_altitude=max(sum,highest_altitude)
            sum+=gain[i]
        highest_altitude=max(sum,highest_altitude)
        return highest_altitude
        