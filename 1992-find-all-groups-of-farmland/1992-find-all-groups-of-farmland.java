
class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> farmlands = new ArrayList<>();
        int rows = land.length;
        int cols = land[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    int[] farmland = bfs(land, visited, i, j);
                    farmlands.add(farmland);
                }
            }
        }

        int[][] result = new int[farmlands.size()][4];
        for (int i = 0; i < farmlands.size(); i++) {
            result[i] = farmlands.get(i);
        }
        return result;
    }

    private int[] bfs(int[][] land, boolean[][] visited, int startRow, int startCol) {
        int rows = land.length;
        int cols = land[0].length;
        int[] farmland = {startRow, startCol, startRow, startCol};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        int[] directions = {-1, 0, 1, 0, -1}; // to move in 4 directions (left, up, right, down)
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            // Update bottom-right coordinates of the farmland
            farmland[2] = Math.max(farmland[2], row);
            farmland[3] = Math.max(farmland[3], col);

            for (int d = 0; d < 4; d++) {
                int newRow = row + directions[d];
                int newCol = col + directions[d + 1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && land[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                    queue.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }

        return farmland;
    }
}
