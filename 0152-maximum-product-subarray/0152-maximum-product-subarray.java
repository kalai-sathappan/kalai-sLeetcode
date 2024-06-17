class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0],max=nums[0],min=nums[0]; 

        for(int i=1;i<nums.length;i++){  
        
            if(nums[i]<0){ 
                int t=max; 
                max=min; 
                min=t;
            } 
            max = Math.max(nums[i],nums[i]*max); 
            min = Math.max(nums[i],nums[i]*min);
            ans = Math.max(max,ans);
        } 
        return ans;
    }
}