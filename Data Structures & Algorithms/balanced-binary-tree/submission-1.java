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
    public boolean isBalanced(TreeNode root) {


        if(root==null){
            return true;
        }

      int ans=  isbalanc(root);
      if(ans==0){
        return false;
      }
      return true;
        
    }
    public int isbalanc(TreeNode root){
        if(root==null){
            return 1;
        }
        int lh= isbalanc(root.left);
        int rh= isbalanc(root.right);

        if(Math.abs(lh-rh)>1){
            return 0;
        }

        if(lh==0 || rh==0){
            return 0;
        }

        return 1+ Math.max(lh,rh);
    }
}
