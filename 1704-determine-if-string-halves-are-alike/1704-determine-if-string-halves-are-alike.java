class Solution {
    public boolean halvesAreAlike(String s) { 

        s = s.toLowerCase();
        
        int half = s.length()/2;  
        int m=0,n=0;

        for(int i=0;i<half;i++){ 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){ 
                m++;
            }
        } 

        for(int i=half;i<s.length();i++){ 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){ 
                n++;
            }
        } 

        if(m==n){ 
            return true;
        } 
        return false;
    }
}