class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i:arr){  
            if(c==3){ 
                return true;
            }
            if(i%2!=0){ 
                c++;
            } 
            else{ 
                c = 0;
            }
        }  
        if(c==3){
            return true;
        }
        return false;
    }
}