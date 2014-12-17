/**
 * Created by panqiuhui on 2014/12/2.
 */
public class Solution {
    private boolean result = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        dfs(p, q);
        return result;
    }

    private void dfs(TreeNode p, TreeNode q) {
        if (!result) {
            return;
        }
        if (p.val == q.val) {
            if (p.left == null && q.left != null) {
                result = false;
                return;
            } else if (p.left != null && q.left == null) {
                result = false;
                return;
            }
            if (p.left != null && q.left != null) {
                dfs(p.left, q.left);
            }
            if (p.right == null && q.right != null) {
                result = false;
                return;
            } else if (p.right != null && q.right == null) {
                result = false;
                return;
            }
            if (p.right != null || q.right != null) {
                dfs(p.right, q.right);
            }
        } else {
            result = false;
        }
    }

}
