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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>l=new ArrayList<>();   
        traverse(root1,l); 
        t(root2,l); 
        Collections.sort(l); 
        return l;
        

    } 
    public static void traverse(TreeNode root1,List<Integer>l){ 
        if(root1==null){ 
            return;
        }
            traverse(root1.left,l); 
            l.add(root1.val); 
            traverse(root1.right,l);
         
        
    } 
    public static void t(TreeNode root2,List<Integer>l){  
        if(root2==null){ 
            return;
        }
         
            traverse(root2.left,l); 
            l.add(root2.val); 
            traverse(root2.right,l);
        }
}