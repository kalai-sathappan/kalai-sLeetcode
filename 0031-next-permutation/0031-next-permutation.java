class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 2;
        
        // Find the first decreasing element from the end
        while (n >= 0 && nums[n + 1] <= nums[n]) {
            n--;
        }
        
        if (n >= 0) {
            int j = nums.length - 1;
            
            // Find the element just larger than nums[n]
            while (j >= 0 && nums[j] <= nums[n]) {
                j--;
            }
            
            // Swap elements at n and j
            swap(nums, n, j);
        }
        
        // Reverse the elements from n+1 to the end of the array
        reverse(nums, n + 1);
    }

    static void swap(int[] a, int s, int e) {
        int t = a[s];
        a[s] = a[e];
        a[e] = t;
    }

    static void reverse(int[] a, int s) {
        int e = a.length - 1;
        while (s < e) {
            swap(a, s, e);
            s++;
            e--;
        }
    }
}
