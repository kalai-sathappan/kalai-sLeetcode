class Solution {
    public List<String> generateParenthesis(int n) { 

        List<String> l = new ArrayList<>(); 
        par(n,n,"",l); 
        return l;

    } 
    static void par(int open,int close,String p,List<String>l){ 
        if(open == close & open == 0){  
            l.add(p);
            return;
        } 
        if(open > 0){ 
            par(open-1,close,p+"(",l);
        } 
         if(close > 0 & close > open){ 
           par(open,close-1,p+")",l);
        }
    } 
     
}