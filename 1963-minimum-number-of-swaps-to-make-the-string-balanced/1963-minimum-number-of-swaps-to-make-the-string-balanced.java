class Solution {
    public int minSwaps(String s) { 
        Stack<Character> st = new Stack<>(); 

        int ans = 0; 
        for(char c:s.toCharArray()){ 
            if(c=='['){ 
                st.push(c);
            } 
            else{ 
                if(st.isEmpty()){
                    ans++;
                }
                else{ 
                    st.pop();
                }
            }
        } 
        if(st.size()==1 && ans == 1){ 
            return ans;
        }
        else if(st.size()==ans && ans==0){ 
            return ans;
        }   
        return ans-1;
    }
}