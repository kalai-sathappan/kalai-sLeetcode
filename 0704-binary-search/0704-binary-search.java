class Solution {
    public int search(int[] nums, int target) {
        return bs(0, nums.length - 1, nums, target);
    }

    static int bs(int l, int h, int[] n, int tar) {

        if (l > (h)) {
            return -1;
        }

        int mid = l + (h-l) / 2;

        if (n[mid] == tar) {
            return mid;
        } else if (tar > n[mid]) {
            return bs(mid + 1, h, n, tar);
        } else {
            return bs(l, mid - 1, n, tar);
        }
    }
}
