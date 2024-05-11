class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[]=new int[nums.length];  
        int k=0;
        for(int i:nums){ 
            if(i>=0){ 
                a[k++]=i;
            }
        } 

        for(int i:nums){ 
            if(i<0){ 
                a[k++]=i;
            }
        }  

        int b[]=new int[a.length];  
        int j=a.length/2,x=0;

        for(int i=0;i<a.length/2;i++){ 
            b[x++]=a[i]; 
            b[x++]=a[j++];
        } 

        return b;
    }
}