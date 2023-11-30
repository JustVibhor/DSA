package Tree.BinaryTrees;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        tree.populateSorted(nums);
        tree.display();

    }
}
