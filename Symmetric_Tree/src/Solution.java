/**
 * 解法一：递归方法
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return this.isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 != null && n2 == null) {
            return false;
        }
        if (n1 == null && n2 != null) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return this.isMirror(n1.left, n2.right) && this.isMirror(n1.right, n2.left);
    }
}
