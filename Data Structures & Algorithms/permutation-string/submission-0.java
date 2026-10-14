class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int left = 0;
        int fixedWindow = s1.length();
        for(char c : s1.toCharArray())
            freq1[c-'a']++;
        for(int right = 0; right < s2.length();right++){
            freq2[s2.charAt(right)-'a']++;
            while(right-left+1 > fixedWindow){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1 == fixedWindow && Arrays.equals(freq1,freq2))
                return true;
        }
        return false;
    }
}
