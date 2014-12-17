/**
 * Created by panqiuhui on 2014/12/2.
 */
public class Solution {
    private int maxDepth;

    public int maxDepth(TreeNode root) {
        maxDepth = 0;
        if (root == null) {
            return maxDepth;
        }
        dfs(root, 0);
        return maxDepth;
    }

    private void dfs(TreeNode node, int depth) {
        if (depth > maxDepth) {
            maxDepth = depth;
        }
        if (node.left != null) {
            dfs(node.left, depth + 1);
        }
        if (node.right != null) {
            dfs(node.right, depth + 1);
        }
    }
}
