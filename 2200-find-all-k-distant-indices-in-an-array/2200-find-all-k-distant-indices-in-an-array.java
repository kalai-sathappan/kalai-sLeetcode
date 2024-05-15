class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> l = new ArrayList<>();   
        Set<Integer> s = new HashSet<>();
        List<Integer> l1 = new ArrayList<>(); 

        for(int i=0;i<nums.length;i++){ 
            if(nums[i]==key) 
               l.add(i);
        } 

        for(int i:l){ 
             for(int j=0;j<nums.length;j++){ 
                if(Math.abs(i-j)<=k && nums[i]==key){
                    s.add(j);
                }
             }
        } 
        
        for(int i:s){ 
            l1.add(i);
        } 
        return l1;
    }
}