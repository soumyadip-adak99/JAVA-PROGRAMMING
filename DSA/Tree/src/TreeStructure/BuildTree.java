package TreeStructure;

public class BuildTree {
    private static int idx = -1;

    public Node buildTree(int[] nodes) {
        idx++;

        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
}
