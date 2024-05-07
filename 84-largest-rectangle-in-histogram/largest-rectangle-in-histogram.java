class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int n = heights.length;
        int[] s = new int[n+1];
        int index = -1;
        for(int i=0; i<n+1; i++) {
            int element = (i==n) ? 0 : heights[i];
            while(index != -1 && heights[s[index]]>element) {
                int h = heights[s[index--]];
                int pivot = (index == -1) ? -1 : s[index];
                int w = i - pivot - 1;
                area = Math.max(area, h*w);
            }
            s[++index] = i;
        }
        return area;
    }
}