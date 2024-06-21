class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int sum = 0; 
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<nums.length;i++){ 
            if((nums[i] - nums[i-1])==0){
                l.add(nums[i]);
            }
        } 
        if(l.size()==1){ 
            return l.get(0);
        } 
        for(int i:l){ 
            sum = sum ^ i;
        } 
        return sum;
        

    }
}