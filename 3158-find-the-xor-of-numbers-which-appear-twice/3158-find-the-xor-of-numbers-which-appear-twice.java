class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=1;i<nums.length;i++){ 
            if((nums[i] - nums[i-1])==0){
                sum += nums[i];
            }
        } 
        return sum==0?0:sum;
        

    }
}