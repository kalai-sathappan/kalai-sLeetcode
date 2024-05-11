class Solution {
    public int findMiddleIndex(int[] nums) {
        int a[]=new int[nums.length]; 
        int b[]=new int[nums.length]; 
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){ 
            a[i]=s1+nums[i];  
            s1 = s1 + nums[i];
        }  
        int k=0;
        for(int i=nums.length-1;i>=0;i--){ 
            b[k]=s2+nums[i];  
            s2 = s2 + nums[i]; 
            k++;
        }  
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){ 
            if(a[i]==b[j]){ 
                return i;
            } 
            j--;
        } 
        return -1;
    }
}