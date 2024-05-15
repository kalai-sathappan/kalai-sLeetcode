class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if(nums.length==1){ 
            return start;
        } 

        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){ 
            if(nums[i]==target){ 
                min = Math.min(min,Math.abs(start-i));
            }
        } 
        return min;
    }
}