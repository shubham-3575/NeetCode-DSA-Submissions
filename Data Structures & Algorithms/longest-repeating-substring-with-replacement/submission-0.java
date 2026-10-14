class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int rep[] = new int[26];
        int maxf = 0;
        int maxLen = 0;
        for(int right=0;right<s.length();right++){
            rep[s.charAt(right)-'A']++;
            maxf = Math.max(maxf, rep[s.charAt(right)-'A']);

            while((right-left+1)-maxf>k)
            {
                rep[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
