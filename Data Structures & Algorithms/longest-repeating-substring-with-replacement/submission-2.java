class Solution {
    public int characterReplacement(String s, int k) {
        int cl = 0, ml = 0;
        int ok = k;
        if(s.length() <= 1) return s.length();
        char mc = s.charAt(0);
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i == 0) mc = ch;
            else if(ch == mc) cl++;
            else {
                if(k != 0) {k--; cl++;}
                else {k = ok; cl = 1; mc = ch;}
            }
            ml = Math.max(cl , ml);
        }
        return ml;
        
    }
}
