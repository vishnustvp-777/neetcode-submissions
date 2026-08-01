class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]" , "");
        int left = 0, right = s.length()-1;
        char[] arr = str.toCharArray();
        while(left < right) {
            if(arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}
