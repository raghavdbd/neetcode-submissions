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
    public boolean isValidBST(TreeNode root) {


        if(root==null){
            return true;
        }

  return calc(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        

        
        
    }

    public boolean calc(TreeNode root, int min, int max){

        if(root==null){
            return true;
        }
        if(root.val>min && root.val < max ){

            return calc(root.left,min,root.val)&& calc(root.right,root.val,max);



        }else{
            return false;
        }

}
}
