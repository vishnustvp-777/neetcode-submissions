class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];
        int count = 0;
        for(int i = 0; i < 256; i++) {
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }
        for(int val : arr) {
            if(val != 0) return false;
        }
        return true;
    }
}
