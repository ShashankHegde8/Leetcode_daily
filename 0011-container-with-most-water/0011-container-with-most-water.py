class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxstorage=0
        left , right=0,len(height)-1

        while left<right:
            storage=0
            if height[left]<height[right]:
                h=height[left]
                left+=1
            else:
                h=height[right]
                right-=1
            storage= h * (right-left+1)
            maxstorage=max(maxstorage , storage)

        return maxstorage
