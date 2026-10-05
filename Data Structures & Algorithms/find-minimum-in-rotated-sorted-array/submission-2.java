class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        if(nums.length==1 || nums[0]<nums[nums.length-1])
            return nums[0];
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];
            if(nums[mid]<nums[mid-1])
                return nums[mid];
            if(nums[l]<nums[mid])
                l = mid+1;
            else
                r = mid-1;
        }
        return nums[0];
    }
}
