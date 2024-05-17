class Solution {
    public int arrangeCoins(int n) {
             int i = 1,a = 0;
            while((n-i)>0){  
                n = n - i; 
                i++; 
                a++;
            } 
            if((n-i)==0){ 
                a++;
            }
            return a;
    }
}