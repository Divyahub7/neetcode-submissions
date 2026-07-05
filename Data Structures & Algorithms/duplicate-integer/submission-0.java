class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int val = nums[i];
            int c = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] == val) c++;
            }
            if(c > 1) return true;
        }
        return false;
    }
}