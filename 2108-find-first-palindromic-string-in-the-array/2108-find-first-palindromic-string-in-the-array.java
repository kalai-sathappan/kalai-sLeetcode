class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){ 
            if(s.length()==1){ 
                return s;
            } 
            if(palin(s)){ 
            return s;    
            }
        } 
        return ""; 
    } 
    static boolean palin(String s){ 
        int i=0,j=s.length()-1; 
        while(i<j){ 
            if(s.charAt(i)==s.charAt(j)){ 
                --j; 
                i++;
            } 
            else{ 
                return false;
            }
        } 
        return true;
    }
}