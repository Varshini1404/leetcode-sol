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
class FindElements {
    TreeNode root;
    boolean b = true;
    Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        this.root = root;
        TreeNode node = root;
        node.val = 0;
        set.add(0);
        dfs(node);
    }
    public void dfs(TreeNode root) {
        if(root == null)
            return;
        int save = root.val;
        if(root.left != null){
            root.left.val = 2 * save + 1;
            set.add(root.left.val);
        }
        if(root.right != null){
            root.right.val = 2 * save + 2;
            set.add(root.right.val);
        }
        dfs(root.left);
        dfs(root.right);
    }
    public void print(TreeNode root) {
        if(root == null)
            return;
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
    public void print(Set set) {
        System.out.println(set);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */