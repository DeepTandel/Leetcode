class Solution {
    public int maxProfit(int[] nums) {
        int ans=0;
        int buy = nums[0];
        int n=nums.length;
        for(int i=0; i<n; i++) {
            if(buy >= nums[i]) {
                buy = nums[i];
            }
            ans = Math.max(ans, nums[i] - buy);  
        }
        return ans;
    }
}