class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length-1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int totalWater = 0;

        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax) {
                totalWater += (leftMax - height[left]);
                left++;
            }
            else {
                totalWater += (rightMax - height[right]);
                right--;
            }
        }
        return totalWater;
    }
}
