class Solution {
    public boolean divisorGame(int n) { 
        int a1 = 0; 
        boolean alice = false, bob = true;
        for(int i=1;i<n;i++){ 
            for(int j=1;j<n;j++){ 
                if(n%j==0){ 
                    if(a1==0){ 
                        alice = true; 
                        bob = true;  
                        a1=1; 
                    } 
                    else{ 
                        bob = false; 
                        alice = false; 
                        a1 = 0;
                    } 
                    break;
                }
            }
        } 
        if(alice){ 
            return true;
        } 
        return false;
    }
}