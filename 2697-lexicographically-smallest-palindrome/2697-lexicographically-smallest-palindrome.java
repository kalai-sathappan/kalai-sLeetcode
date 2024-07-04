class Solution {
    public String makeSmallestPalindrome(String s) {
        
        int i=0,j=s.length()-1; 

        while(i<j){ 
            if(s.charAt(i)!=s.charAt(j)){ 
                if(j==s.length()-1){ 
                    if(s.charAt(i)<s.charAt(j)){
                          s = s.substring(0,j)+s.charAt(i);  
                    } 
                    else{  
                          s =s.charAt(j)+s.substring(i+1); 
                    }
                } 
                else{  
                    if(s.charAt(i)<s.charAt(j)){
                   s = s.substring(0,j)+s.charAt(i)+s.substring(j+1);  
                    } 
                    else{ 
                        s = s.substring(0,i)+s.charAt(j)+s.substring(i+1); 
                    } 
                }
            } 
            i++;
            j--;
        } 
        return s;
    }
}