class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0; 
        boolean f=true;  
        for(int i=0;i<words.length;i++){  
            f=true;
            for(int j=0;j<words[i].length();j++){ 
                if(allowed.contains(String.valueOf(words[i].charAt(j)))){ 
                    continue;
                } 
                else{ 
                    f=false; 
                    break;
                }
            }
            if(f){ 
                c++;
            }
        } 
        return c;
    }
}