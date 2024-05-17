class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int a [][] = new int [m][n]; 

        if((m*n)==original.length){ 
         int k=0;
        for(int i=0;i<m;i++){ 
            for(int j=0;j<n;j++){ 
                a[i][j]=original[k++];
            }
        } 
        }  
        else{ 
            return new int[][]{};
        } 
        return a;
    }
}