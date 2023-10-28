package LinkedList.Questions.Sorting;


public class MergeSort {


    public ListNode sort(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sort(head);
        ListNode right = sort(mid);

        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode realAns = new ListNode();
        ListNode ans = realAns;

        while (left != null && right != null) {
            if(left.val > right.val) {
                ans.next = right;
                right = right.next;
            } else {
                ans.next = left;
                left = left.next;
            }
            ans = ans.next;
        }

        ans.next = (left != null) ? left : right;

        return ans;
    }


    public ListNode getMid(ListNode head) {
        ListNode m = null;

        while (head != null && head.next != null) {
            m = ((m == null) ? head : m.next);
            head = head.next.next;
        }

        ListNode mid = m.next;
        m.next = null;

        return mid;
    }

    private class ListNode {
        private ListNode next;
        private int val;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
