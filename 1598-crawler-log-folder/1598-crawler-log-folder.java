class Solution {
    public int minOperations(String[] logs) {
        int c = 0;

        for(String s:logs){
            
            if(s.contains("../")){ 
                c--;
            }  
            else if(s.contains("./")){
                continue;
            } 
            else{ 
               c++;
            }
        } 
        return (c<0)?0:c;
    }
}