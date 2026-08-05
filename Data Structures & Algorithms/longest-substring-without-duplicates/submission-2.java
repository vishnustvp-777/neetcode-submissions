class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int currentLength = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
            }
            else {
                currentLength = set.size();
                set.clear();
                set.add(ch);
            }
            maxLength = Math.max(currentLength , maxLength);
            currentLength = 0;
        }
        return maxLength;
    }
}
