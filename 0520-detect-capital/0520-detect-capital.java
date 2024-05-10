class Solution {
    public boolean detectCapitalUse(String word) {
      Stack<Character>s  = new Stack<>(); 

      for(int i=0;i<word.length();i++){ 
        if(word.charAt(i)>=65 && word.charAt(i)<=90){
            s.add(word.charAt(i));
        }
      } 
      if(s.size()==word.length()){ 
        return true;
      } 
      if(s.size()==1){ 
        if(s.pop()==word.charAt(0)){ 
            return true;
        }
      } 
      return false;
    }
}