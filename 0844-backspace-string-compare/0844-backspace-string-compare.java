class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();  
        Stack<Character> s2=new Stack<>(); 

        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)=='#'){  
                if(!s1.isEmpty()){
                s1.pop(); 
                continue; 
                } 
                continue;
            } 
            s1.push(s.charAt(i));
        } 

        for(int i=0;i<t.length();i++){ 
            if(t.charAt(i)=='#'){  
                if(!s2.isEmpty()){
                s2.pop(); 
                continue; 
                } 
                continue;
            } 
            s2.push(t.charAt(i));
        }  
        while(!s1.isEmpty()){ 
            if(s1.pop()==s2.pop()){ 
                continue;
            } 
            return false;
        } 
        return true;
    }
}