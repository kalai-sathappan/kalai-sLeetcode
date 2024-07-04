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
        List<Integer> l1 = new ArrayList<>(); 
        List<Integer> l2 = new ArrayList<>();  
        inorder(p,l1);
        inorder(q,l2);   
        
        return l1.equals(l2);

    }
    static void inorder(TreeNode root,List<Integer> l){ 
        if(root == null){  
            l.add(null);
            return ;
        }  
         l.add(root.val);
        inorder(root.left,l);
        inorder(root.right,l); 
    } 

}