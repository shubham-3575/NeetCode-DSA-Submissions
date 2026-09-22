class Solution {
    public int trap(int[] height) {
       int left = 0, right = height.length-1;
       int vol = 0;
       int lm = 0, rm = 0;
       while(left < right){
            lm = Math.max(lm, height[left]);
            rm = Math.max(rm, height[right]);
            if(lm < rm){
                vol += lm - height[left];
                left++;
            }
            else{
                vol += rm - height[right];
                right--;
            }
       }
       return vol; 
    }
}
