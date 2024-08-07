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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){ 
            return false;
        } 
        return sym(root.left,root.right);
    } 
    static boolean sym(TreeNode r1, TreeNode r2){ 
        if(r1==null & r2==null){ 
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        } 
        return (r1.val == r2.val) & sym(r1.left,r2.right) & sym(r2.left,r1.right);
    }
}