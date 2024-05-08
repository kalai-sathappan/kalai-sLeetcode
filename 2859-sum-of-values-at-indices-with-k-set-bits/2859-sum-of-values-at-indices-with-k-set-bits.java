class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) { 
        int c=0,sum=0; 
        if(nums.size()==1 ){ 
            if(k==0)
            return nums.get(0);
            else{
                return 0;
            }
        }

        for(int i=1;i<nums.size();i++){ 
            String s = Integer.toBinaryString(i); 
            for(int j=0;j<s.length();j++){ 
                if(s.charAt(j)=='1'){ 
                    c++;
                }
            } 
            if(c==k){ 
                sum = sum + nums.get(i);
            } 
            c=0;
        } 
        return sum;
    }
}