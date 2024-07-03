class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) { // Prevent infinite loop if the target color is the same as the original
            floodFillHelper(image, sr, sc, color, originalColor);
        }
        return image;
    }
    
    private void floodFillHelper(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        
        image[sr][sc] = color;
        
        floodFillHelper(image, sr - 1, sc, color, originalColor); // up
        floodFillHelper(image, sr + 1, sc, color, originalColor); // down
        floodFillHelper(image, sr, sc - 1, color, originalColor); // left
        floodFillHelper(image, sr, sc + 1, color, originalColor); // right
    }
}
