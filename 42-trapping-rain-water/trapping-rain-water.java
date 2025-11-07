class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMaxBoundry[] = new int[n];
        leftMaxBoundry[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundry[i] = Math.max(height[i], leftMaxBoundry[i-1]);
        }
        int rightMaxBoundry[] = new int[n];
        rightMaxBoundry[n - 1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMaxBoundry[i] = Math.max(height[i], rightMaxBoundry[i+1]);
        }
        int trappingRainWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMaxBoundry[i], leftMaxBoundry[i]);
            trappingRainWater += waterLevel - height[i];
        }
        return trappingRainWater;
    }
}