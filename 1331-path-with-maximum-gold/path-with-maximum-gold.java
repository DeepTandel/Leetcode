class Solution {
    int rows, cols;
    private int dfs(int row, int col, int[][] grid, boolean[][] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;
        int maxGold = 0;
        int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dir[i][0];
            int nextCol = col + dir[i][1]; 
            maxGold = Math.max(maxGold, dfs(nextRow, nextCol, grid, visited));
            
        }

        visited[row][col] = false;
        return maxGold + grid[row][col];
    }

    public int getMaximumGold(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int maxGold = 0;
        int totalSum = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                totalSum += grid[i][j];
            }
        }
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(i, j, grid, visited));
                    if(maxGold == totalSum) {
                        return totalSum;
                    }
                }
            }
        }
        return maxGold;
    }
}
