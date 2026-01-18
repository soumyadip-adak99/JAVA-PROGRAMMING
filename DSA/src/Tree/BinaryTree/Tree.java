package Tree.BinaryTree;

public class Tree {

    public int index = -1;

    public Node buildTree(int[] nodes) {
        index++;

        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
} 
