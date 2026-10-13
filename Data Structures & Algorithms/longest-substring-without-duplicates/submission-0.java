class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int left = 0;
        int maxLen = 0;
        Set<Character> dup = new HashSet<>();
        for(int right = 0;right<s.length();right++){
            while(dup.contains(s.charAt(right))){
                dup.remove(s.charAt(left));
                left++;
            }
            dup.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
