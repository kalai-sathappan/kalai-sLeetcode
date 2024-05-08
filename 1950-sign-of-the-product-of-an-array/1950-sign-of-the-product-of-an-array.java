class Solution {
    public int arraySign(int[] nums) {
        List<Integer>l=new ArrayList<>(); 
        int c=0;
        for(int i:nums){ 
            if(i<0){
                c++;
            }
            l.add(i);
        } 

        if(l.contains(0)){
            return 0;
        } 
        if(c%2==0){
            return 1;
        }
        return -1;

    }
}