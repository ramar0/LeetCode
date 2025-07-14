class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        arr = nums1 + nums2
        sorted_arr = sorted(arr)
        middle = len(sorted_arr) // 2
        if len(sorted_arr) % 2 == 0:
            res = (sorted_arr[middle]+sorted_arr[middle-1]) /2.0
        else:
            res = sorted_arr[middle]

        return res
