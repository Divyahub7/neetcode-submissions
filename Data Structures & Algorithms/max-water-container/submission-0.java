class Solution {
    public int maxArea(int[] heights) {
        int maxi = 0;
        int left = 0, right = heights.length-1;

        while(left < right) {
            int curr = (right-left)*Math.min(heights[left], heights[right]);
            maxi = Math.max(maxi, curr);

            if(heights[left] < heights[right]) {
                left++;
            }
            else if(heights[left] > heights[right]) {
                right--;
            }
            else {
                if((left+1) < right && heights[left+1] > heights[right-1]) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return maxi;
    }
}
