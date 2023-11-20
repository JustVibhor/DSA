package BinaryTrees;

public class CustomBinaryTree {

    public CustomBinaryTree() {

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


    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root + "Root Node: ");
    }

    private void display(Node node, String s) {
        if(node == null) {
            return;
        }

        System.out.println(s + node.value);
        display(node.left, "Left Node of " + node.value + ": ");
        display(node.right);
    }

}
