class Solution {
    public int maxDistance(int[] colors) {
        int ans1 = 0,ans2 = 0; 

        for(int i=colors.length-1;i>0;i--){
            if(colors[0]!=colors[i]){ 
                ans1 = i; 
                break;
            }
        }  

        for(int i=0;i<colors.length-1;i++){  
            if(colors[colors.length-1]!=colors[i]){ 
                ans2 = Math.abs(i-(colors.length-1)); 
                break;
            }
        } 
        return Math.max(ans1,ans2);       
    }
}