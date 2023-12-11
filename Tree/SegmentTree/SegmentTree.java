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

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval: [" + node.left.startInterval + ", " + node.left.endInterval
                    + "] and data: " + node.left.data + " -> ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str += "Interval: [" + node.startInterval + ", " + node.endInterval
                + "] and data: " + node.data + " <- ";

        if (node.right != null) {
            str = str + "Interval: [" + node.right.startInterval + ", " + node.right.endInterval
                    + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + "\n");

        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {

        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }
}
