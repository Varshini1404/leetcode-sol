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
            int tot = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return tot;
    }
    public int dfs(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        int tilt = Math.abs(left- right);
        tot+=tilt;
        return node.val+left+right;
    }
}