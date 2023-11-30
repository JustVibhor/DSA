package Tree.AVL;

public class AVL {

    public AVL() {

    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height() {
        return root.height;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left-left case
                return rightRotate(node);
            }

            if (height(node.left.left) - height(node.left.right) < 0) {
                // left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // right heave
            if (height(node.right.right) - height(node.right.left) > 0) {
                // right-right case
                return leftRotate(node);
            }

            if (height(node.right.right) - height(node.right.left) > 0) {
                // right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        p.right = t;
        c.left = p;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        p.left = t;
        c.right = p;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public void populate(int[] nums) {
        for (int n : nums) {
            insert(n);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String s) {
        if (node == null) {
            return;
        }

        System.out.println(s + node.value);
        display(node.left, "Left Node of " + node.value + ": ");
        display(node.right, "Right Node of " + node.value + ": ");
    }

}
