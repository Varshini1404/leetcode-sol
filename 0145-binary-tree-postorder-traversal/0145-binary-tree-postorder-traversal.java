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
    private List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        postorderHelper(root);
        return result;
    }
    public void postorderHelper (TreeNode root) {
            if(root==null)
            {
                return;
            }
           postorderHelper(root.left);
           postorderHelper(root.right);
           result.add(root.val);

    }

    
}