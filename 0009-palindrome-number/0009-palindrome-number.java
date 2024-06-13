class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){ 
            return false;
        }  
        String s1 = Integer.toString(x);
        return check(s1,0,s1.length()-1,1);
    } 
    static boolean check(String str,int s,int e,int flag){ 
        if(s>e && flag==1){ 
            return true; 
        }  
        else if(s>e && flag==0){ 
            return false;
        } 
        else{ 
            if(str.charAt(s)==str.charAt(e)){ 
                return check(str,++s,--e,1);
            } 
            else{ 
                return false;
            }
        }
    }
}