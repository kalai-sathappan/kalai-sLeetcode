class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c=nums.length/3; 
        Map<Integer,Integer> m = new HashMap<>(); 

        for(int i:nums) {
            if(m.containsKey(i)){ 
                m.put(i,m.get(i)+1);
            } 
            else{ 
                m.put(i,1);
            }
        } 
        List<Integer> l = new ArrayList<>(); 
        for(int i:m.keySet()){ 
            if(m.get(i)>c){ 
                l.add(i);
            }
        } 
        return l;
    }
}