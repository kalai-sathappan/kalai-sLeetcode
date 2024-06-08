class Solution {
    public int fib(int n) { 
        if(n==0){
            return 0;
        }
        int f1=-1,f2=1,f3=0,sum=0; 
        for(int i=0;i<n;i++){ 
            f3=f1+f2;  
            f1=f2; 
            f2=f3;
        }
        return f3+f1;
    }
}