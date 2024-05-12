class Solution {
    public int maxValue(int[][] mat, int starInRow, int starInCol){
        int max = 0;
        for(int i=starInRow; i<starInRow+3;i++) {
            for(int j=starInCol; j<starInCol+3; j++) {
                max = Math.max(max, mat[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i=0; i<n-2;i++) {
            for(int j=0; j<n-2; j++) {
                ans[i][j] = maxValue(grid, i, j);
            }
        }
        return ans;
    }
}