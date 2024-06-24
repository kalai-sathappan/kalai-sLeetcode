class Solution {
    public int numIslands(char[][] grid) { 
        if (grid == null || grid.length == 0) {
            return 0;
        }
         
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) { 
            for (int j = 0; j < grid[0].length; j++) { 
                if (grid[i][j] == '1' ) { 
                    markIsland(i, j, grid); 
                    count++;
                }
            }
        } 
        
        return count;
    } 
    
    static void markIsland(int i, int j, char[][] grid) { 
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        } 
        grid[i][j]='2';
        markIsland(i - 1, j, grid);
        markIsland(i + 1, j,  grid);
        markIsland(i, j - 1,  grid);
        markIsland(i, j + 1, grid);
    }
}
