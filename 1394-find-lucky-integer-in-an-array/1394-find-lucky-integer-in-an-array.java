class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>(); 

        for(int i:arr){ 
            m.put(i,m.getOrDefault(i,0)+1);
        }  
        int max = Integer.MIN_VALUE;
        for(int i:m.keySet()){ 
            if(m.get(i)==i){ 
                max = Math.max(i,max);
            }
        } 
        
        if(max<0){ 
            return -1;
        } 
        return max;
    }
}