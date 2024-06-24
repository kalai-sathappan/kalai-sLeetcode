class Solution {
    public int findJudge(int n, int[][] trust) { 
        if(n==1){ 
            return 1;
        }
         int otdeg[] = new int[n+1];  
         int indeg [] = new int[n+1]; 

         for(int i=0;i<trust.length;i++){ 
            int a = trust[i][0];
            otdeg[a] = otdeg[a] + 1;
         }  

         for(int i=0;i<trust.length;i++){ 
            int a = trust[i][1]; 
            indeg[a] = indeg[a] + 1;
         }

         for(int i=1;i<otdeg.length;i++){ 
            if(otdeg[i] == 0 && indeg[i]==(n-1)){ 
                return i;
            }
         } 
         return -1;
    } 

}