class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> hist = new Stack<>();
        int maxArea = 0;
        int[] arr = Arrays.copyOf(heights,heights.length+1);
        arr[heights.length] = 0;
        for(int i=0;i<arr.length; i++){
            int area = 0;
            while(!hist.isEmpty() && arr[hist.peek()]>arr[i]){
                    int h = arr[hist.pop()];
                    int width = hist.isEmpty()?i:i-hist.peek()-1;
                    area = h*width;
                    maxArea = Math.max(area, maxArea);
            }
            hist.push(i);
        }
        return maxArea;
    }
}
