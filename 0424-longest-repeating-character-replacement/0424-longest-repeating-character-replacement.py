class Solution(object):
    def characterReplacement(self, s, k):
        count = {}
        left = 0
        maxf = 0   # max frequency of a single char in window
        res = 0

        for right in range(len(s)):
            # add current char
            count[s[right]] = count.get(s[right], 0) + 1

            # update max frequency
            maxf = max(maxf, count[s[right]])

            # check if window is valid
            while (right - left + 1) - maxf > k:
                count[s[left]] -= 1
                left += 1

            res = max(res, right - left + 1)

        return res