class Solution {
    public int maximumStrongPairXor(int[] nums) {  
        int max = Integer.MIN_VALUE; 

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){ 
            int min = nums[i]; 
            for(int j=i;j<nums.length;j++){ 
                int diff = nums[j] - min; 
                if(diff<=min){ 
                    max = Math.max(max,(nums[i]^nums[j]));
                } 
                else{ 
                    break;
                }
            } 
            
        } 
        return max;
    }
}