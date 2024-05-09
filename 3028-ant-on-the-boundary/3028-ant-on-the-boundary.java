class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0,ans=0; 
        for(int i=0;i<nums.length;i++){  
            if(c==0 && i!=0)
            {
                ans++;
            } 
            else{ 
                c=c+nums[i];
            }
        } 
        if(c==0){
            ans++;
        } 
        return ans;
    }
}