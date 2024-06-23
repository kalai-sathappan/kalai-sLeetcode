class Solution {
    public int minAddToMakeValid(String s) { 
        int ans = 0;
       Stack <Character> st = new Stack<>();
       for(char c:s.toCharArray()){ 
        if(c=='('){ 
            st.push(c);
        } 
        else{ 
            if(st.isEmpty()){ 
                ans++;
            } 
            else if(st.peek()=='(' && c == ')'){ 
                st.pop();
            } 
        }
       }  
       return st.size()+ans;
    }
}