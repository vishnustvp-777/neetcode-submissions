class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if(strs.length == 1) return strs[0];
        if(strs.length == 0) return "";

        String pat = strs[0];
        
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            String str = strs[i];
            while(pat.charAt(j) == str.charAt(j) && j <= pat.length()) {
                sb.append(pat.charAt(j));
                j++;
                System.out.println(sb.toString());
            }
            if(sb.length() == 0) return "";
            pat = sb.toString();
            sb.setLength(0);
        }

        return pat;
    }
}