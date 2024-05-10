class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); 
        Arrays.sort(nums2);   

        int c=0;
       if(nums1[0]>nums2[0]){ 
        c=nums2[0]-nums1[0];
       } 
       else{ 
        c=nums2[0]-nums1[0];
       } 
       return c;
    }
}