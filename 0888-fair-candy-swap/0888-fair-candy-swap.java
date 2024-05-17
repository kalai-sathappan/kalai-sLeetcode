class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int alice =0, bob = 0; 
        for(int i=0;i<aliceSizes.length;i++){ 
            alice += aliceSizes[i];
        } 

        for(int i=0;i<bobSizes.length;i++){ 
            bob += bobSizes[i];
        } 

        int avg = (alice+bob)/2; 

        List<Integer> l = new ArrayList<>();

        for(int i:bobSizes){ 
            l.add(i);
        }           

        for(int i:aliceSizes){ 
            int target = avg-(alice-i); 
            if(l.contains(target)){ 
                return new int[]{i,target};
            }
        }
        return new int[]{0,0};
    }
}