class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase().replaceAll("[^a-zA-Z0-9]" , "");
        int left = 0, right = s.length-1;
        while(left < right) {
            if(s.toCharArray(left) != s.toCharArray(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
