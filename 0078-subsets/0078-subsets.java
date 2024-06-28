class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<>(); 
        out.add(new ArrayList<>()); 

        for(int k:nums){ 
            int n = out.size(); 
            for(int i=0;i<n;i++){ 
                List<Integer> in = new ArrayList<>(out.get(i)); 
                in.add(k);
                out.add(in);
            }
        } 
        return out;
 
    }
}