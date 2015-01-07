import java.util.LinkedList;
import java.util.Queue;

/**
 * 解法二：非递归方法
 */
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> leftNodes = new LinkedList<TreeNode>();
        Queue<TreeNode> rightNodes = new LinkedList<TreeNode>();
        leftNodes.add(root.left);
        rightNodes.add(root.right);
        while (!leftNodes.isEmpty() && !rightNodes.isEmpty()) {
            TreeNode leftNode = leftNodes.poll();
            TreeNode rightNode = rightNodes.poll();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null) {
                return false;
            }
            if (leftNode.val != rightNode.val) {
                return false;
            }
            leftNodes.add(leftNode.left);
            leftNodes.add(leftNode.right);
            rightNodes.add(rightNode.right);
            rightNodes.add(rightNode.left);
        }
        return true;
    }
}
