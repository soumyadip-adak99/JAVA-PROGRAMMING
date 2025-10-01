package Tree.TreeBasic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Traversal {
   static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // reset idx before every buildTree call
    private static int idx;

    public static Node buildTree(int[] nodes) {
        if (idx >= nodes.length) return null;

        int val = nodes[idx];
        idx++;

        if (val == -1) {
            return null;
        }

        Node newNode = new Node(val);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    // postorder traversal
    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    // level order traversal with line breaks
    public static void levelorder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode == null) {
                System.out.println();
                if (!queue.isEmpty()) queue.add(null);
            } else {
                System.out.print(currentNode.value + " ");
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
        }
    }

    // level order traversal returning a list of levels
    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.value);

                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        idx = 0; // reset before building tree
        Node root = buildTree(nodes);

        System.out.println("Preorder:");
        preorder(root);
        System.out.println("\nInorder:");
        inorder(root);
        System.out.println("\nPostorder:");
        postorder(root);
        System.out.println("\nLevel Order:");
        levelorder(root);

        System.out.println("Level Order List:");
        System.out.println(levelOrderTraversal(root));
    }
}