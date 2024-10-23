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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null){
            return null;
        }
        help(root);
        root = help2(root);
        return help3(root, 0);
    }

    List<Integer> l = new ArrayList<>();
    
    public void help(TreeNode root){ //fills up list with sum of all nodes in a level
        Queue<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            while(size-- > 0){
                TreeNode curr = q.remove();
                sum += curr.val;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            l.add(sum);
        }
    }

    public TreeNode help2(TreeNode root){  //replaces each nodes value with the sum of its own value and its siblings' value
        Queue<TreeNode> q = new ArrayDeque<>();

        q.add(root); 

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                TreeNode curr = q.remove();
                int chsum = 0;  //child sum (left and right of a node)
                if(curr.left != null){
                    chsum += curr.left.val;
                }
                if(curr.right != null){
                    chsum += curr.right.val;
                }
                if(curr.left != null){
                    curr.left.val = chsum;
                    q.add(curr.left);
                }
                if(curr.right != null){
                    curr.right.val = chsum;
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
    
    public TreeNode help3(TreeNode root, int k){  //replaces value of each node with sum of its cousins
        if(root == null){
            return null;
        }
        if(k == 0 || k == 1){
            root.val = 0;
        }
        else{
            int sumval = l.get(k);
            int changeval = root.val;
            root.val = sumval - changeval;
        }
        root.left = help3(root.left, k+1);
        root.right = help3(root.right, k+1);
        return root;
    }
}