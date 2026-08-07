class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n == 1) return 0;
        int lo = 0; 
        int hi = n - 1;
        int mid = lo + (hi - lo) / 2;
        for(int i = 0 ; i < n; i++) {
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) {hi = mid; mid = lo + (hi - lo) / 2;}
            else if(nums[mid] < target) {lo = mid; mid = lo + (hi - lo) / 2;}
        }
        return -1;
    }
}
