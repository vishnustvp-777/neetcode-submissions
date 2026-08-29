class Solution {
    public void sortColors(int[] nums) {
        
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0) + 1);
        }

        int i = 0;
        for(int num : freq.keySet()) {
            int count = freq.get(num);
            while(count-->0) nums[i++] = num;
        }

        return nums;
    }
}