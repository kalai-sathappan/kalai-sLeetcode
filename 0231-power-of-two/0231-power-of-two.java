class Solution {
    public boolean isPowerOfTwo(int n) {
       int a=ans(n,0);
       return a==1?true:false;
    } 
    static int ans(int n,int c){ 
        if((int)Math.pow(2,c)==n){ 
            return 1;
        } 
        else if((int)Math.pow(2,c)>n){ 
            return 0;
        } 
       return (n%2==0)?ans(n,++c):0; 
    } 
    
}