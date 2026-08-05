class Solution {
    public int maxArea(int[] heights) {
        int currentAmount = 0;
        int maxAmount = 0;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                int base = j - i;
                int height = Math.min(heights[i] , heights[j]);
                currentAmount = base * height;
                maxAmount = Math.max(currentAmount , maxAmount);
            }
            currentAmount = 1;
        }
        return maxAmount;
    }
}
