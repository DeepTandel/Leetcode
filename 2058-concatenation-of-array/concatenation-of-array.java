class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length *2];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        return arr;
    }
}