class Solution {
    public String triangleType(int[] nums) {
        Set<Integer>s=new HashSet<>(); 

        for(int i:nums){ 
            s.add(i);
        } 

        if(s.size()==1){ 
            return "equilateral"; 
        } 
        else if(s.size()==2){ 
            return "isosceles";
        } 
        else if(s.size()==3){ 
            return "scalene";
        } 
        return "none";
    }
}