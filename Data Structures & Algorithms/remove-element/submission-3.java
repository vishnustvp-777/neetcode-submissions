public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}

/*Initialize a pointer k = 0 to track the position for the next valid element.
Iterate through the array with index i:
If nums[i] is not equal to val, copy it to nums[k] and increment k.
Return k as the count of valid elements.*/