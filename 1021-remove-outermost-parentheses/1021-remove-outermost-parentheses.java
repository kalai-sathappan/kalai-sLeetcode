class Solution {
    public String removeOuterParentheses(String s) {
        
        int i=0,j=0,c=-1;  
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){  
            c = -1; 
               while(j<s.length()){ 
                if(c==0){
                    break;
                } 
                   if(s.charAt(j)=='('){  
                     if(c==-1){
                        c = c+2;
                     } 
                     else{ 
                        c++;
                     }
                   }else{
                      c--;
                   } 
                   j++;
               }   

               sb.append(s.substring(i+1,j-1)); 
               
               
               i = j;
        } 

        return sb.toString();
    }
}