class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a [] = new int[2]; 
        int alice =0, bob = 0; 
        for(int i=0;i<aliceSizes.length;i++){ 
            alice += aliceSizes[i];
        } 

        for(int i=0;i<aliceSizes.length;i++){ 
            bob += bobSizes[i];
        } 

        int avg = (alice+bob)/2; 
        for(int i=0;i<aliceSizes.length;i++){ 
            for(int j=0;j<bobSizes.length;j++){ 
                if((aliceSizes[i]+bobSizes[j])==avg){  
                    a[0]=aliceSizes[i]; 
                    aliceSizes[i]=0;
                    break;
                }
            } 
            if(a[0]>0){
                break;
            }
        }  
         for(int i=0;i<bobSizes.length;i++){ 
            for(int j=0;j<aliceSizes.length;j++){ 
                if((bobSizes[i]+aliceSizes[j])==avg ){  
                    a[1]=bobSizes[i]; 
                    bobSizes[i]=0;
                    break;
                }
            } 
            if(a[1]>0)
               break;
        } 
        return a;
    }
}