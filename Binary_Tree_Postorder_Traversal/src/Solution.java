import java.util.*;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Map<TreeNode, Boolean> flag = new HashMap<TreeNode, Boolean>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                flag.put(cur, false);
                cur = cur.left;
            }
            cur = stack.peek();
            if (flag.get(cur)) {
                result.add(cur.val);
                stack.pop();
                cur = null;
            } else {
                flag.put(cur, true);
                cur = cur.right;
            }
        }
        return result;
    }
}
