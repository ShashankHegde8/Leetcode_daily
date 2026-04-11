class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # for i in range(len(nums)):
        #     squares=nums[i]*nums[i]
        #     nums[i]=squares
        # nums.sort()
        # return nums

        n=len(nums)
        result = [0] * n
        left,right=0, n-1
        pos=n-1

        while left<=right:
            if abs(nums[left]) > abs(nums[right]):
                
                result[pos]=nums[left] * nums[left]
                left+=1
            else:
                result[pos]=nums[right] * nums[right]
                right-=1
            pos-=1

        return result