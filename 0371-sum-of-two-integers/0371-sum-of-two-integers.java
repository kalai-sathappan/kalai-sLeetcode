class Solution {
    public int getSum(int a, int b) {
        while(b!=0){ 
            int car = a & b; 

            a = a ^ b ; 

            b = car << 1;
        } 
        return a;
    }
}