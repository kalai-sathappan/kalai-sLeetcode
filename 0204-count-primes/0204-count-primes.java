class Solution {
    public int countPrimes(int n) { 
        if(n<=1){ 
            return 0;
        }
       int c=0; 
        boolean arr[]=new boolean[n+1];
        
        for(int i=2;i*i<=n;i++){ 
            if(arr[i]==false){ 
                for(int j=i*2;j<=n;j=j+i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==false){
                c++;
            }
        } 
        return c;
    }
}