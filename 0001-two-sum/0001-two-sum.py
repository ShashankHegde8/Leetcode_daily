class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # res=[]
        # for i in range(0,len(nums)):
        #     for j in range(i+1,len(nums)):
        #         if nums[i] + nums[j] == target :
        #             res.append(i)
        #             res.append(j)
        #             return res
        
        seen = {}
        for i , num in enumerate(nums):
            diff = target - num 
            if diff in seen :
                return [ seen[diff], i]
            seen[num] = i