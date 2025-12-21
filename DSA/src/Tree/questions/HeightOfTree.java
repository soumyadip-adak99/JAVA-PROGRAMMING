package Tree.questions;

import Tree.Tree;
import Tree.Node;

public class HeightOfTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1});
        System.out.println(heightOfTree(root));
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
