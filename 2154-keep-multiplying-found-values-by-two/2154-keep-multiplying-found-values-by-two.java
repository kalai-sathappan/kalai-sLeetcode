class Solution {
    public int findFinalValue(int[] nums, int original) {
        List <Integer> l =new ArrayList<>(); 

        for(int i:nums){ 
            l.add(i);
        }

        while(l.contains(original)){ 
            original = original *2 ; 
        } 
        return original;
    }
}