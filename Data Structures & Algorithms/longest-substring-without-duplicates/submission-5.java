class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.length() <= 1) return s.length();
        int currentLength = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
            }
            //else {
//
            //}
            currentLength = set.size();
            maxLength = Math.max(currentLength , maxLength);
            currentLength = 0;
        }
        return maxLength;
    }
}
