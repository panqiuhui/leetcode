/**
 * Created by panqiuhui on 2014/12/5.
 */
public class Solution {
    private int tempSum = 0;
    private boolean result = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }
        dfs(root, sum);
        return result;
    }

    public void dfs(TreeNode node, int sum) {
        if (result) {
            return;
        }
        tempSum += node.val;
        if (node.left != null) {
            dfs(node.left, sum);
        }
        if (node.right != null) {
            dfs(node.right, sum);
        }
        if (node.left == null && node.right == null) {
            if (tempSum == sum) {
                result = true;
            }
        }
        tempSum -= node.val;
    }
}
