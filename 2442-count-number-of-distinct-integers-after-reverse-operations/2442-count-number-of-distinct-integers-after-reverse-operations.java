class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>(); 

        for(int i:nums){  
            st.add(i); 
            int sum = 0;
            while(i>0){ 
                sum = sum*10 + (i%10); 
                i = i/10;
            } 
            st.add(sum);
        }
     
    return st.size(); 
    }
}