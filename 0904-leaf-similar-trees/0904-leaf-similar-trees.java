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
    public void s(TreeNode root,List<Integer> a)
    {
        if(root == null)
        {
            return;
        }
        if(root.left == null && root.right == null)
        {
            a.add(root.val);
        }
        s(root.left,a);
        s(root.right,a);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        s(root1,arr1);
        s(root2,arr2);

        return arr1.equals(arr2);
    }
}