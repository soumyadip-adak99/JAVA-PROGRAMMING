package Tree.BinaryTree.questions;

import Tree.BinaryTree.Tree;
import Tree.BinaryTree.Node;

public class DiameterOfTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree(new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1});
        System.out.println(getDiameterOfTree(root).diameter);
    }


    /**
     * ===========================================
     * Approach -1
     * ============================================
     *
     */

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int d1 = diameterOfTree(root.left);
        int d2 = diameterOfTree(root.right);
        int d3 = height(root.left) + height(root.right);

        return Math.max(d3, Math.max(d1, d2));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return leftHeight + rightHeight + 1;
    }

    /**
     * ===========================================
     * Approach -2
     * ============================================
     *
     */

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo getDiameterOfTree(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = getDiameterOfTree(root.left);
        TreeInfo right = getDiameterOfTree(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int d1 = left.diameter;
        int d2 = right.diameter;
        int d3 = left.height + right.height + 1;

        int diameter = Math.max(d3, Math.max(d1, d2));

        return new TreeInfo(height, diameter);
    }
}
