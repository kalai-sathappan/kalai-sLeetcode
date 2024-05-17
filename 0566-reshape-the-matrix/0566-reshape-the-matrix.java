class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) { 
        
        List<Integer> l = new ArrayList<>(); 
        for(int i = 0;i<mat.length;i++){ 
            for(int j=0;j<mat[0].length;j++){ 
                l.add(mat[i][j]);
            }
        } 

        int a[][] = new int[r][c]; 
        int k=0;
        for(int i=0;i<r;i++){ 
            for(int j=0;j<c;j++){ 
                if(k>=l.size()){
                    return mat;
                }
                a[i][j] = l.get(k); 
                k++;
            }
        }  
        if(k<l.size()){
            return mat;
        }
        return a;
    }
}