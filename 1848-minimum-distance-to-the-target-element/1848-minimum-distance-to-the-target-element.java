class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if(nums.length==1){ 
            return start;
        } 

        for(int i=0;i<nums.length;i++){ 
            if(nums[i]==target){ 
                return Math.abs(start-i);
            }
        } 
        return -1;
    }
}