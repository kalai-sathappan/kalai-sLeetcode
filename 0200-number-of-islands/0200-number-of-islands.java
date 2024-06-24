class Solution {
    public int numIslands(char[][] grid) { 
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];  
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) { 
            for (int j = 0; j < grid[0].length; j++) { 
                if (grid[i][j] == '1' && !visited[i][j]) { 
                    markIsland(i, j, visited, grid); 
                    count++;
                }
            }
        } 
        
        return count;
    } 
    
    static void markIsland(int i, int j, boolean[][] visited, char[][] grid) { 
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] != '1') {
            return;
        } 
        visited[i][j] = true; 
        markIsland(i - 1, j, visited, grid);
        markIsland(i + 1, j, visited, grid);
        markIsland(i, j - 1, visited, grid);
        markIsland(i, j + 1, visited, grid);
    }
}
