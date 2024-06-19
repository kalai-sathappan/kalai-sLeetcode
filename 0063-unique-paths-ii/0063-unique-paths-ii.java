public class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m=o.length;
        int n=o[0].length;
        int[]arr=new int[n];
        arr[0]=1;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(o[i][j]==1) {
                    arr[j]=0;
                } else if(j>0) {
                    arr[j]+=arr[j-1];
                }
            }
        }
        return arr[n - 1];
    }
}