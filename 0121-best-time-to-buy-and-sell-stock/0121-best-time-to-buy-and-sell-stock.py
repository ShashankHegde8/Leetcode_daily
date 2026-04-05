class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minnum=prices[0]
        maxprofit=0

        for i , num in enumerate(prices):
            minnum=min(minnum,prices[i])
            maxprofit=max(maxprofit , (prices[i]-minnum))

        return maxprofit

        