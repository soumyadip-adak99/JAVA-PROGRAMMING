package Tree.BinarySearchTree;

public class BuildBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static Node searchNode(Node root, int k) {
        while (root != null) {
            if (root.data == k)
                return root;
            else if (k < root.data)
                root = root.left;
            else
                root = root.right;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int k : values) {
            root = insert(root, k);
        }

        inorderTraversal(root);

        System.out.println(searchNode(root, 2) == null ? "NOT_FOUND" : "FOUND");
    }
}
