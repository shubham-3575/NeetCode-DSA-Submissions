class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = Arrays.stream(piles).max().getAsInt();
        int result = high;
        while(low <= high){
            int mid = low+(high-low)/2;
            int totalTime = 0;
            for(int pile : piles){
                totalTime += (pile+mid-1)/mid;
            }
            if(totalTime <= h){
                result = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return result;

    }
}
