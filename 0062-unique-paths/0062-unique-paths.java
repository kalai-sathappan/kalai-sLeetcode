class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1){ 
            return m;
        }
        int a[]=new int[n]; 
        a[0]=0; 
        for(int i=1;i<n;i++){ 
            a[i]=1;
        } 
        value(a,m); 
        return a[n-1];
    } 
    static void value(int []a,int r){  
        int sum = 0; 
    for(int j=1;j<r;j++){
          sum = 0;
        for(int i=0;i<a.length;i++){ 
            if(i==0){
                a[i]=1;
                sum=1;
            } 
            else{
            a[i] = a[i] + sum; 
            sum = a[i];
        }
        } 
    }
    }
}