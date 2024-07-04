/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorder(p).equals(preorder(q));
    }

    private List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            result.add(null); // Using null to represent a null node
            return;
        }
        result.add(root.val);
        preorderHelper(root.left, result);
        preorderHelper(root.right, result);
    }
}
