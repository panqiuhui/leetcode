/**
 * Created by panqiuhui on 2014/12/5.
 */
public class Solution {
    private int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 1);
        return minDepth;
    }

    private void dfs(TreeNode node, int depth) {
        if (node.left != null) {
            dfs(node.left, depth + 1);
        }
        if (node.right != null) {
            dfs(node.right, depth + 1);
        }
        if (node.left == null && node.right == null) {
            if (depth < minDepth) {
                minDepth = depth;
            }
        }
    }
}
