package leetcode.editor.en;/**
 * @Time 2021-04-09 5:37 PM
 * @Author MijazzChan
 */

public class UtilsTools {
    static class ListNode {
        int val;
        ListNode next;

        // Constructor
        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.val).append("=>");
            while (this.next != null) {
                stringBuilder.append(this.next.val).append("=>");
                this.next = this.next.next;
            }
            return stringBuilder.append("NULL").toString();
        }
    }

    static ListNode buildListNodeFrom(int[] values) {
        ListNode head = new ListNode(0, new ListNode());
        ListNode listNode = head.next;
        if (null == values || values.length == 0) {
            throw new IllegalArgumentException("Values[] cannot be null");
        }
        for (int i = 1; i < values.length; i++) {
            listNode.val = values[i - 1];
            listNode.next = new ListNode(values[i]);
            listNode = listNode.next;
        }
        return head.next;
    }


}
