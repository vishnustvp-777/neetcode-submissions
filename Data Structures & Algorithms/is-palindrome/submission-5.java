class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase().replaceAll("^[a-zA-Z0-9]" , "");
        int left = 0, right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left < right) {
            if(arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}
