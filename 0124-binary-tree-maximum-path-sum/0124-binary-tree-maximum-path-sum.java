
class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;
    }

    private int maxPath(TreeNode root){
        if(root == null) return 0;

        int lh = Math.max(0, maxPath(root.left));
        int rh = Math.max(0, maxPath(root.right));

        maxSum = Math.max(maxSum, root.val + lh + rh);

        return root.val + Math.max(lh, rh);

    }
}