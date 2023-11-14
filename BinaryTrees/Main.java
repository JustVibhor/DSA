package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomBinaryTree tree = new CustomBinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
