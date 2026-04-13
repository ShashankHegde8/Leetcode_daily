class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        h1={}

        for num in nums:
            h1[num]=h1.get(num,0) + 1

        heap=[]

        for num,freq in h1.items():
            heapq.heappush(heap,(-freq,num))

        result=[]
        for _ in range(k):
            result.append(heapq.heappop(heap)[1])

        return result
        