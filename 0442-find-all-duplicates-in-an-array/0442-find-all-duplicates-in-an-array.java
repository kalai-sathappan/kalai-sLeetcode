class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       Map<Integer,Integer> m = new HashMap<>();  
       List<Integer> l = new ArrayList<>();

       for(int i:nums){ 
           if(m.containsKey(i)){ 
            m.put(i,m.get(i)+1);
           } 
           else{ 
            m.put(i,1);
           }
       }  

       for(int i:m.keySet()){ 
        if(m.get(i)>1){ 
            l.add(i);
        }
       } 
       return l;
    }
}