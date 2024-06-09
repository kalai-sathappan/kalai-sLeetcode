class Solution {
    public int numberOfSteps(int num) {
        return ans(num,0);
    } 
    static int ans(int num,int c){
        if(num==0){ 
            return c;
        } 
        return (num%2==0)?ans(num/2,++c):ans(num-1,++c);
    }
}