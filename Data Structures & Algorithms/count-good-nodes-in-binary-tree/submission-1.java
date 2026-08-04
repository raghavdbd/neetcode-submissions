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
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        count(root,root.val);
        return ans;
        
    }
    public void count(TreeNode root,int value){
        if(root==null){
            return ;
        }
       if(root.val>=value){
        value=root.val;
        ans++;
       }
       count(root.left,value);
       count(root.right,value);
       return;
    }
}
