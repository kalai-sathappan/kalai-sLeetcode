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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {  
       
        List <Integer> l1 = new ArrayList<>(); 
        List <Integer> l2 = new ArrayList<>();    
         
        
        inorder(root1,l1); 
        inorder(root2,l2); 

         return l1.equals(l2);

    } 
    static void left1(TreeNode root1,List<Integer> l1){ 
        if(root1.left==null){  
            if(root1.right == null)
            l1.add(root1.val); 
            return ;  
        }
        left1(root1.left,l1);
    }  
    static void r1(TreeNode root1,List<Integer> l1){ 
        if(root1.right==null){  
            if(root1.left == null)
            l1.add(root1.val);
            return ;  
        }
        r1(root1.right,l1);
    }  
    static void left2(TreeNode root2,List<Integer> l2){ 
        if(root2.left==null){ 
            if(root2.right == null) 
            l2.add(root2.val);  
            return ; 
        }
        left1(root2.left,l2);
    } 
    static void r2(TreeNode root2,List<Integer> l2){ 
        if(root2.left==null){  
            if(root2.right == null)
            l2.add(root2.val); 
            return ;
        } 
        r2(root2.right,l2);
    }   
    static void inorder(TreeNode root,List<Integer> l1){ 
        if(root == null){ 
            return ;
        }  
        if(root.left==null & root.right == null){ 
            l1.add(root.val);
        }
        inorder(root.left,l1); 
        inorder(root.right,l1); 

    }


}