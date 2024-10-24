/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Start at the root of the BST
        TreeNode currentValue = root;
        
  
        while (currentValue != null) {
            
            if (p.val > currentValue.val && q.val > currentValue.val) {
                currentValue = currentValue.right;
            }
         
            else if (p.val < currentValue.val && q.val < currentValue.val) {
                currentValue = currentValue.left;
            }
           
            else {
                return currentValue;
            }
        }
        return null; // In case there's no LCA (this shouldn't happen in a valid BST)
    }
}
