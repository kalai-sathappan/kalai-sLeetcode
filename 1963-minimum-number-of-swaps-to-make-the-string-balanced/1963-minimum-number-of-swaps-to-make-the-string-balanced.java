class Solution {
    public int minSwaps(String s) { 
        Stack<Character> st = new Stack<>(); 
        for(char c:s.toCharArray()){ 
            if(c=='['){ 
                st.push(c);
            } 
            else{ 
                if(st.isEmpty()){
                    continue;
                }
                else{ 
                    st.pop();
                }
            }
        }   
        return (st.size()%2==0)?st.size()/2:(st.size()+1)/2;
    }
}