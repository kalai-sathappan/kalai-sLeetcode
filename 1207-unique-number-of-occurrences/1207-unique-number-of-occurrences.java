class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer,Integer> m = new HashMap<>(); 

       for(int i:arr){ 
          m.put(i,m.getOrDefault(i,0)+1);
       }  

       Set<Integer> s = new HashSet<>();

       for(int i:m.keySet()){ 
          s.add(m.get(i));
       } 

       if(m.size()==s.size()) { 
         return true;
       } 
       return false;
    }
}