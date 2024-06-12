import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        // Using counting sort for this specific problem
        int[] count = new int[3]; // Since we only have 0, 1, and 2

        // Count the occurrences of each color
        for (int num : nums) {
            count[num]++;
        }

        // Refill the array based on the counts
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            Arrays.fill(nums, index, index + count[i], i);
            index += count[i];
        }

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);
    }
}
