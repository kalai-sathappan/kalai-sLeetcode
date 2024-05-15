class Solution {
    public int countTriples(int n) {
        int a [] = new int[n];  
        int j=0;
        for(int i=1;i<=n;i++){   
            a[j++]=i;
        } 

        int c =0 ; 
        for(int x = 0;x<a.length;x++){ 
            for(int y=0;y<a.length;y++){ 
                for(int z=0;z<a.length;z++){
                    if((a[x]*a[x])+(a[y]*a[y])==(a[z]*a[z])){ 
                        c++;
                    }
                }
            }
        } 
        return c;
    }
}