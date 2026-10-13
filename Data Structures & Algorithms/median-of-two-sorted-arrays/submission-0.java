class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int n = nums1.length, m = nums2.length;
        int total = n+m;
        int half = (total+1)/2;

        int left = 0, right = n;
        while(left <= right){
            int part1 = left+(right-left)/2;
            int part2 = half-part1;

            int nums1Left = part1 == 0?Integer.MIN_VALUE : nums1[part1-1];

            int nums1Right = part1 == n?Integer.MAX_VALUE:nums1[part1];

            int nums2Left = part2 == 0 ? Integer.MIN_VALUE:nums2[part2-1];
            int nums2Right = part2 == m? Integer.MAX_VALUE:nums2[part2];

            if(nums1Left <= nums2Right && nums2Left <= nums1Right){
                if(total %2 == 1){
                    return Math.max(nums1Left, nums2Left);
                }

                int leftMax = Math.max(nums1Left, nums2Left);
                int rightMin = Math.min(nums2Right, nums1Right);
                return (leftMax+rightMin)/2.0;
            }

            if(nums1Left > nums2Right)
                right = part1-1;
            else
                left = part1+1;
        }
return -1.0;
    }
}
