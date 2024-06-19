class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0,right=nums.length-1; 
        int a[] = new int[nums.length]; 
        for(int i=0;i<nums.length;i++){ 
            int l = leftc(nums,i-1); 
            int r = rightc(nums,i+1); 
            a[i] = Math.abs(l-r);
        } 
        return a;
    } 
    static int leftc(int b[],int i){ 
        if(i<0){
            return 0;
        }
        return b[i]+leftc(b,--i);
    } 
    static int rightc(int c[],int ind){ 
        if(ind==c.length){ 
            return 0;
        } 
        return c[ind]+rightc(c,++ind);
    }
}