class Solution {
    public int percentageLetter(String s, char letter) {
        int c = 0; 

        for(int i=0;i<s.length();i++){ 
            if(letter==s.charAt(i)){ 
                c++;
            }
        } 

        return ((c/s.length())/100);
    }
}