class Solution {
    public int trap(int[] height) {
        int l=0,leftMax=height[0],sum=0;
        int r=height.length-1,rightMax=height[r];
        /*while(l<r) {
            if(leftMax<=rightMax) {
                sum += (leftMax - height[l]);
                l++;
                leftMax = Math.max(leftMax, height[l]);
            } else {
                sum += (rightMax - height[r]);
                r--;
                rightMax = Math.max(rightMax, height[r]);
            }
        }*/
        while(l<r) {
            if(leftMax <= rightMax) {
                sum += (leftMax - height[l]);
                l++;
                leftMax = Math.max(leftMax, height[l]);
            } else {
                sum += (rightMax - height[r]);
                r--;
                rightMax = Math.max(rightMax, height[r]);
            }
        }
        return sum;
    }
}