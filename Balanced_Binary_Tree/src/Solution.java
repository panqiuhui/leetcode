/**
 * Created by panqiuhui on 2014/12/5.
 */
public class Solution {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            dfs(root);
        }
        return result;
    }

    private int dfs(TreeNode node) {
        if (!result) {
            return -1;
        }
        int leftDepth = 0;
        int rightDepth = 0;
        if (node.left != null) {
            leftDepth = dfs(node.left);
        }
        if (node.right != null) {
            rightDepth = dfs(node.right);
        }
        if (leftDepth - rightDepth > 1 || rightDepth - leftDepth > 1) {
            result = false;
        }
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }
}
