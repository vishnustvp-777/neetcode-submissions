class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String pat = strs[0];
        if(strs.length == 1) return strs[0];
        if(strs.length == 0) return "";

        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            String str = strs[i];
            while(pat.charAt(j) == str.charAt(j) && (j < pat.length())) {
                sb.append(pat.charAt(j));
                j++;
            }
            if(sb.length() == 0) return "";
            pat = (String) sb;
            sb = "";
        }

        return pat;
    }
}