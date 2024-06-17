class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>(); 

        for(int n:nums){ 
            st.add(n);
        } 

        if(nums.length==st.size()){ 
            return false;
        } 
        return true;
    }
}