class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer>s = new HashSet<>(); 
        for(int i:nums){ 
            if(s.contains(i)){ 
                s.remove(i); 
            } 
            else{ 
                s.add(i);
            }
        } 
        int a[] = new int[s.size()];  
        int j=0;
        for(int i:s){ 
            a[j++]=i;
        } 
        return a;
    }
}