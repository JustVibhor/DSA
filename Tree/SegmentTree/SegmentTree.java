package Tree.SegmentTree;

public class SegmentTree {

    private class Node {
        int startInterval;
        int endInterval;
        int data;

        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int s, int e) {
        // if s == e, we at the leaf node
        if (s == e) {
            Node leaf = new Node(s, e);
            leaf.data = arr[s];
            return leaf;
        }

        // create other nodes
        Node node = new Node(s, e);

        int mid = s + (e - s) / 2;

        node.left = constructTree(arr, s, mid);
        node.right = constructTree(arr, mid + 1, e);

        node.data = node.left.data + node.right.data;

        return node;
    }


}
