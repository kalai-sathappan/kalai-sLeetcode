class Solution {
    public int findMin(int[] nums) {
        int i=0,j=1; 

        for(int k=1;k<nums.length;k++){ 
              if((nums[k]-nums[k-1])>0){
                 continue;
              }
              return nums[k];
        }
        return nums[0];

    }
}