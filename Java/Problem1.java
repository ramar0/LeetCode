class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int [n+m];

        int i = 0;
        for(int j=0; j<m;j++) {
            arr[i] = nums1[j];
            i++;
        }

        for(int j =0; j<n;j++) {
            arr[i] = nums2[j];
            i++;
        }

        Arrays.sort(arr);
        
        Double res = 0.0;
        if (arr.length % 2 == 0) {
            res = ((double)arr[arr.length/2] + (double)arr[(arr.length/2)-1])/2;
             
        } else {
            res= (double)arr[arr.length/2];
        }

        return res;
    }
}
