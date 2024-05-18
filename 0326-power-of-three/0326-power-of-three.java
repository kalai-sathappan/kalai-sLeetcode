class Solution {
    public boolean isPowerOfThree(int n) {
           int i=3 ,rem =0;
           while(i!=0 && n>0){ 
               rem = n % 3; 
               n = n / 3; 
               i--;
           }        
           if(rem==0 && i==0){ 
            return true;
           } 
           return false;
    }
}