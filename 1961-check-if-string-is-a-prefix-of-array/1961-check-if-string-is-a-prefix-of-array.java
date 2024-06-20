class Solution {
    public boolean isPrefixString(String s, String[] words) {
      String str = ""; 

      for(String c:words){ 
        str += (c);
        if(s.contains(str)){ 
            if(str.equals(s)){
                return true;
            }
        }
      }
      return (str.equals(s))?true:false;  
      
    }
}