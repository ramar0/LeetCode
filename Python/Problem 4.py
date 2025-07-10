class Solution(object):
    def isMatch(self, s, p):
        i_s = 0
        i_p = 0
        res = false

        for i in range(0, len(s)):
            if 0 == len(p):
                return 0 == len(s)

            res = i_s < len(s) and (p[i_p] == s[i_s] or p[i_p] == '.')

            if !res:
                break;

            if i_p+1 < len(p) and p[i_p+1] == '*':
                if i_s+1 < len(s) and s[i_s+1] != p[i_p]:
                    i_p += 2
                else:
                    i_s++
            else:
                i_p++
                i_s++
        return res
