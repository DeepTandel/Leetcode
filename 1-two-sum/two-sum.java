class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l < nums.length - 1) {
            if(target - nums[r] == nums[l]) {
                return new int[]{l,r};
            } else {
                r--;
            }
            if(l==r){
                l++;
                r=nums.length-1;
            }
        }
        return new int[]{};
    }
}