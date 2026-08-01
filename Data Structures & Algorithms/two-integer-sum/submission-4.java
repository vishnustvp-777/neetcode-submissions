class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        for(int num : nums) {
            map.put(num , target - num);
        }
        for(int key : map.keySet()) {
            int value = map.get(key);
            if(map.containsKey(value)) {
                solution[0] = key;
                solution[1] = value;
                if(checkIndices(nums, solution)) return solution;
                else continue;
            }
        }
        return solution;
    }

    public boolean checkIndices(int[] nums, int[] solution) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == solution[0]) solution[0] = i;
            else if(nums[i] == solution[1]) solution[1] = i;
            if(i != nums.length-1 && solution[0] == solution[1]) continue;
        }
        if(solution[0] == solution[1]) return false;
        Arrays.sort(solution);
        return true;
    }
}
