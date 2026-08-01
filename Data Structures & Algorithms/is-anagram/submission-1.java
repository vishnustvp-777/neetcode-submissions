class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];
        for(int i = 0; i < 256; i++) {
            arr[(char)s.charAt(i)]++;
            arr[(char)t.charAt(i)]--;
        }
        for(int val : arr) {
            if(val != 0) return false;
        }
        return true;
    }
}
