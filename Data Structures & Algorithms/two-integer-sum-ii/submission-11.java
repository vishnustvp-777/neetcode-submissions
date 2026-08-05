class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum > target) right--;
            else if(sum < target) left++;
            else if(sum == target) return new int[] {left + 1, right + 1};
        }

        return new int[] {-1 , -1};
    }
}
