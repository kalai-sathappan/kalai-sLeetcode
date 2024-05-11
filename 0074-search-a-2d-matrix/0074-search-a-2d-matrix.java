class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ind = 0; 

        for(int i=0;i<matrix.length;i++){ 
            if(matrix[i][matrix[0].length-1]>=target){ 
                ind = i; 
                break;
            }
        } 

        for(int i=0;i<matrix[0].length;i++){ 
            if(matrix[ind][i]==target){ 
                return true;
            }
        } 

        return false;
    }
}