class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        

        int a[] = new int [nums.length/2]; 
        int b[] = new int [nums.length/2]; 

        int j=0,k=0;
        for(int i=0;i<nums.length;i=i+2){ 
            a[j++]=nums[i];
        } 
        
        for(int i=1;i<nums.length;i=i+2){ 
            b[k++]=nums[i];
        } 

        

        for(int i=0;i<a.length-1;i++){ 
            if(a[i]==a[i+1]){ 
                return false;
            }
        } 

        for(int i=0;i<b.length-1;i++){ 
            if(b[i]==b[i+1]){ 
                return false;
            }
        } 

        return true;
    }
}