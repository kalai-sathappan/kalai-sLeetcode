class Solution {
    public int balancedStringSplit(String s) { 
        int i=1,j=1,ans=0; 
        while(s.charAt(0)=='L' && j<s.length()){   
            
            if(s.charAt(j)=='L'){
                i++;
            } 
            else if(s.charAt(j)=='R'){ 
                i--;
            } 
            if(i==0){
                ans++;
            } 
            j++;
        } 
        while(s.charAt(0)=='R' && j<s.length()){   
            
            if(s.charAt(j)=='R'){
                i++;
            } 
            else if(s.charAt(j)=='L'){ 
                i--;
            } 
            if(i==0){
                ans++;
            } 
            j++;
        }
        return ans;
    }
}