class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s1=set()
        for num in nums:
            if num in s1:
                return True
            s1.add(num)
        
        return False
        