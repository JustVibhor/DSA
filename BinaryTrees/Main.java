package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomTree tree = new CustomTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
