class Solution {
    //fliping the rows
    private void flipRows(int[][] mat, int row) {
        for(int i=0; i<mat[0].length; i++) {
            mat[row][i] = (mat[row][i] == 1) ? 0 :1;
        }
    }

    //count coloum of one
    private int countOne(int[][] grid, int col) {
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            if(grid[i][col] == 1) {
                count ++;
            }
        }
        return count;
    }


    public int matrixScore(int[][] grid) {
        //flip the rows
        for(int rows=0; rows<grid.length; rows++) {
            if(grid[rows][0] == 0) {
                flipRows(grid, rows);
            }
        }
        
        int power = grid[0].length - 1;
        int score = (int)(grid.length * Math.pow(2,power));
        power--;

        //count the score
        for(int col=1; col<grid[0].length; col++) {
            int count1 = countOne(grid, col);
            int count0 = grid.length - count1;
            score += (int)(Math.max(count0, count1) * Math.pow(2,power));
            power--;
        }
        return score;
    }
}