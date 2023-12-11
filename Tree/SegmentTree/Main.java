package Tree.SegmentTree;

public class Main {
    public static void main(String[] args) {
        SegmentTree segmentTree = new SegmentTree(new int[] {3, 8, 7, 6, -2, -8, 4, 9});
//        segmentTree.update(0, 1);
//        segmentTree.display();
        System.out.println(segmentTree.query(2, 5));
    }
}
