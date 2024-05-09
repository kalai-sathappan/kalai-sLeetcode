class Solution {
    public boolean stoneGame(int[] piles) { 
        int a=0,b=0;
        for(int i=0;i<piles.length;i=i+2){ 
            a=a+piles[i];
        } 
        for(int i=piles.length-1;i>=0;i=i-2){ 
            b=b+piles[i];
        } 
        int alice=Math.max(a,b); 
        int bob=Math.min(a,b); 
        if(alice>bob){ 
            return true;
        }  
        return false;
        
    }
}