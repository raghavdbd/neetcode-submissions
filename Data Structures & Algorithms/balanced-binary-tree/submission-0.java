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
    int ans=0;
    public boolean isBalanced(TreeNode root) {

        height(root);
        if(ans==-1){
            return false;
        }else{
            return true;
        }


        
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;

        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1){
            ans=-1;
           return -1;
        }
        return 1+Math.max(lh,rh);
       
    }
}
