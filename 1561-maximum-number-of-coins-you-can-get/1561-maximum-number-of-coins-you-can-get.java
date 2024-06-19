class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles); 
        int ans = 0,ind=piles.length-2;
        for(int i=0;i<piles.length/3;i++){
            ans = ans + piles[ind]; 
            ind = ind - 2;
        } 
        return ans;
    }
}