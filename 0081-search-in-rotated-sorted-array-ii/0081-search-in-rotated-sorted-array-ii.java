class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums); 
        int a = Arrays.binarySearch(nums,target); 
        if(a>=0){ 
            return true;
        } 
        return false;
    }
}