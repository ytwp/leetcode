package _2_两数相加;

/**
 *
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode(9);
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(9);
        list1.next = new ListNode(9);
        list1.next.next = new ListNode(9);
        list1.next.next.next = new ListNode(9);
        list1.next.next.next.next = new ListNode(9);

        ListNode list2 = new ListNode(9);
        list2.next = new ListNode(9);
        list2.next.next = new ListNode(9);

        ListNode listNode = new Solution().addTwoNumbers(list1, list2);
        System.out.println(listNode);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
