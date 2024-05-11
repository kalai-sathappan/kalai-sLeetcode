class Solution {
    public boolean search(int[] nums, int target) {
        List<Integer> l = new ArrayList<>(); 

        for(int i:nums){ 
            l.add(i);
        } 

        return l.contains(target);
    }
}