import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by panqiuhui on 2014/12/3.
 */
public class Solution {
    private Queue<Node> bfsQueue = new LinkedList<Node>();
    private List<List<Integer>> order = new LinkedList<List<Integer>>();

    private void bfs() {
        while (!this.bfsQueue.isEmpty()) {
            Node node = this.bfsQueue.poll();
            int depth = node.depth;
            if (this.order.size() <= depth) {
                this.order.add(0, new LinkedList<Integer>());
            }
            List<Integer> level = this.order.get(0);
            level.add(node.treeNode.val);
            if (node.treeNode.left != null) {
                this.bfsQueue.offer(new Node(node.treeNode.left, node.depth + 1));
            }
            if (node.treeNode.right != null) {
                this.bfsQueue.offer(new Node(node.treeNode.right, node.depth + 1));
            }
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root != null) {
            this.bfsQueue.offer(new Node(root, 0));
        }
        this.bfs();
        return this.order;
    }
}

class Node {
    int depth;
    TreeNode treeNode;

    Node(TreeNode treeNode, int depth) {
        this.treeNode = treeNode;
        this.depth = depth;
    }
}