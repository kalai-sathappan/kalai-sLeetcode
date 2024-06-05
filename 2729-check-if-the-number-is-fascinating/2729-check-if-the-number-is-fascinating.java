class Solution {
    public boolean isFascinating(int n) {
        int m=n*2; 
        int k=n*3; 

        String s = String.valueOf(n)+String.valueOf(m)+String.valueOf(k); 
        int c=0;
        if(s.length()>9){ 
            return false;
        }
        for(int i=1;i<10;i++){ 
            if(s.contains(String.valueOf(i))){ 
                c++;
            }
        } 
        
        return c==9?true:false;
    }
}