class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int maxArea = 0;
        while(left<right){
            int width = right-left;
            int length = Math.min(heights[left],heights[right]);
            int area = width*length;
            maxArea = Math.max(area, maxArea);
            if(heights[left]<heights[right]) left++;
            else right--;

        }
        return maxArea;
    }
}
