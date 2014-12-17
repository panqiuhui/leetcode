import java.util.LinkedList;
import java.util.List;

/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private List<List<Integer>> order = new LinkedList<List<Integer>>();

    private void dfs(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (this.order.size() <= depth) {
            this.order.add(new LinkedList<Integer>());
        }
        List<Integer> level = this.order.get(depth);
        level.add(node.val);
        this.dfs(node.left, depth + 1);
        this.dfs(node.right, depth + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        this.dfs(root, 0);
        return this.order;
    }
}


