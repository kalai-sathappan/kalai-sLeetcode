class Solution {
    public String removeDuplicates(String s) {
        String a = ""; 
        Stack<Character> st= new Stack<>(); 
        st.push(s.charAt(0));
        char c = s.charAt(0); 

        for(int i=1;i<s.length();i++){  
            if(!st.isEmpty()){
            if( st.peek()==s.charAt(i)){
                c=st.pop();
            }  
            }
            if(c==s.charAt(i) ){  
                c=s.charAt(i);
                continue;
            }
            else{  
                c=s.charAt(i);
                st.push(s.charAt(i));
            }
        }  
        if(st.size()==0){ 
            return "";
        } 

        while(!st.isEmpty()){ 
            a = a + String.valueOf(st.pop());
        }    

        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b = b + String.valueOf(a.charAt(i));
        } 
        
        return b;
    }
}