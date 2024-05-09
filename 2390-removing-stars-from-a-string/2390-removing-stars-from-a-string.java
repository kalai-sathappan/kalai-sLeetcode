import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>(); 

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){ 
                st.pop(); 
            } 
            else{ 
                st.add(s.charAt(i));
            }
        } 
        String ans = "",x=""; 
        
        while(!st.isEmpty()){ 
            ans = ans + st.pop();
        }   
        for(int i=ans.length()-1;i>=0;i--){  
            x = x + ans.charAt(i);
        }
        
        return x;
    }
}