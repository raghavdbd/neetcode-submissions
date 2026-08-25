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
    public int goodNodes(TreeNode root) {

        if(root==null){
            return 0;
        }

        int ans= calc(root,root.val);
        return ans+1;
        
    }

    public int calc(TreeNode root, int max){

        if(root==null){
            return 0;
        }
        int left=0;
        if(root.left!=null && root.left.val>=max){
            left= 1+ calc(root.left,root.left.val);
        }else{
            left= calc(root.left,max);
        }

         int right=0;
        if(root.right!=null && root.right.val>=max){
            right= 1+ calc(root.right,root.right.val);
        }else{
            right= calc(root.right,max);
        }

        return left+right;





    }
}
