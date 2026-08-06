class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        ArrayDeque<Character> q = new ArrayDeque<>();
        int currentLength = 0, maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                q.offer(ch);
            }
            else {
                currentLength = q.size();
                //set.remove(ch);
                while(!q.isEmpty() && q.peek() != ch) q.poll();
                q.poll();
                q.offer(ch);
            }
            maxLength = Math.max(currentLength , maxLength);
            currentLength = 0;
        }
        return maxLength;
    }
}
