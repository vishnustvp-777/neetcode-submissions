class Solution {
    public int maxArea(int[] heights) {
        int currentAmount = 1;
        int maxAmount = 1;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                int base = j - i;
                int height = Math.min(heights[i] , heights[j]);
                int currentAmount = base * height;
                maxAmount = Math.max(currentAmount , maxAmount);
            }
            currentAmount = 1;
        }
        return maxAmount;
    }
}
