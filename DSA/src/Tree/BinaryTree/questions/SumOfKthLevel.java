package Tree.BinaryTree.questions;

import Tree.BinaryTree.Tree;
import Tree.BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfKthLevel {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1});
        System.out.println(sumOfKthLevel(root, 1));
    }

    public static int sumOfKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0, level = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = q.poll();

                if (level == k) sum += currentNode.data;

                if (currentNode.left != null) q.add(currentNode.left);
                if (currentNode.right != null) q.add(currentNode.right);
            }

            if (level == k) break;
            level++;
        }

        return sum;
    }
}
