public class Solution {
    public int rob(TreeNode root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }
    
    private int[] helper(TreeNode node) {
        if (node == null) return new int[2];
        
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        
        int robCurrent = node.val + left[1] + right[1];
        int skipCurrent = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        
        return new int[] { robCurrent, skipCurrent };
    }
}