class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        depth = 0
        res =[]

        for c in s:
            if c == "(" :
                if depth > 0:
                    res.append(c)
                depth+=1
            else:
                depth -=1
                if depth > 0:
                    res.append(c)

        return "".join(res)


        