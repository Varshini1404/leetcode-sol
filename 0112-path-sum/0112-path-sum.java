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
    public boolean hasPathSum(TreeNode root, int targetSum) {
    
        return check(root,0,targetSum);
    }
    public boolean check(TreeNode root,int curr,int target)
    {
        if(root == null)
        {
            return false;
        }
        curr+=root.val;
        if(root.left == null && root.right == null)
        {
            return curr == target;
        }
         return check(root.left,curr,target) || check(root.right,curr,target);

    }
}