class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0; 
        int k=0; 
        for(int i=0;i<mat.length;i++){ 
            sum = sum + mat[i][k++];
        }  
        k=0;

        for(int i=mat[0].length-1;i>=0;i--){ 
            sum = sum + mat[k++][i];
        }  
        if(mat.length%2!=0)
        sum = sum - mat[mat.length/2][mat[0].length/2];

        return sum;
    }
}