class Solution {
    public int majorityElement(int[] nums) {
        int key = nums[0], count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                key = nums[i]; 
            }
            if(nums[i] == key) count++;
            else count--;
        }

        return key;
    }
}

/*Initialize key as the first ele in array and count = 0.
For each element num:
If count == 0, set key = num.
If num == res, increment count; otherwise decrement count.
Return res as the majority element.
*/