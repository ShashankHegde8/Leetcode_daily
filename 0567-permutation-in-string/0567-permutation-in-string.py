class Solution(object):
    def checkInclusion(self, s1, s2):
        if len(s1) > len(s2):
            return False

        # frequency arrays (26 lowercase letters)
        s1_count = [0] * 26
        window_count = [0] * 26

        # fill s1 frequency
        for c in s1:
            s1_count[ord(c) - ord('a')] += 1

        left = 0

        for right in range(len(s2)):
            # add right character
            window_count[ord(s2[right]) - ord('a')] += 1

            # maintain window size
            if right - left + 1 > len(s1):
                window_count[ord(s2[left]) - ord('a')] -= 1
                left += 1

            # compare
            if window_count == s1_count:
                return True

        return False