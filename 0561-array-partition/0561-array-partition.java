class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int a = 0; 
        for(int i=0;i<nums.length;i=i+2){ 
            a = a + nums[i];
           }
           return a;
    }
}