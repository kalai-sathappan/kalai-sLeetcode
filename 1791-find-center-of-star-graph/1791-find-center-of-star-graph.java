class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> m = new HashMap<>(); 

        for(int i=0;i<edges.length;i++){ 
            for(int j=0;j<edges[0].length;j++){  
                int k = edges[i][j];
                m.put(k,m.getOrDefault(k,0)+1);
            }
        } 

        for(int i:m.keySet()){ 
            if(m.get(i)==edges.length){ 
                return i;
            }
        }
        return -1;
    }
}