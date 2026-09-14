class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2)
            return nums.length;
        int maxLen = 0;
        HashSet<Integer> seq = new HashSet<>();
        for(int val : nums)
            seq.add(val);        
        for(int data : seq){
            int start = data;
            int count = 1;
            if(!seq.contains(start-1)){
                while(seq.contains(start+1)){
                    start += 1;
                    count++;
                }
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
