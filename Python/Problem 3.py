class Solution(object):
    def lengthOfLongestSubstring(s) -> int:
        charMap = {}
        res = 0
        slide = 0

        for end, c in enumerate(s):
            if c in charMap and charMap[c] >= slide:
                slide = charMap[c] + 1
            charMap[char] = end
            res = max(res, end-slide+1)
