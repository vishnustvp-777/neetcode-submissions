class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        ArrayDeque<Character> q = new ArrayDeque<>();
        int currentLength = 0, maxLength = 0;
        if(s.length() <= 1) return s.length();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                q.offer(ch);
            }
            else {
                //set.remove(ch);
                while(!q.isEmpty() && q.peek() != ch) {
                    char removedChar = q.peek();
                    q.poll();
                    set.remove(removedChar);
                }
                q.poll();
                q.offer(ch);
                //currentLength = 0;
            }
            currentLength = q.size();
            maxLength = Math.max(currentLength , maxLength);
        }
        return maxLength;
    }
}
