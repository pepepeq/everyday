/**
 * name：Solution2
 * date：2024/8/9
 * user：nl593
 * description：
 */



  public class Solution2 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode head = new ListNode(0);
//        ListNode current = head;
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//           int x = l1 == null ? 0 : l1.val;
//           int y = l2 == null ? 0 : l2.val;
//           int sum = x + y + carry;
//           carry = sum / 10;
//           current.next = new ListNode(sum % 10);
//           current = current.next;
//        } if (carry > 0) {
//            current.next = new ListNode(carry);
//        }
//        return head.next;
//
//    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        int carry = 0;
        ListNode prev = null;
        while (l1 != null || l2 != null || carry != 0) {
            if(l1 == null) {
                l1 = new ListNode(0);
                prev.next = l1;
            }
            int sum = l1.val + (l2 != null ? l2.val : 0) + carry;
            l1.val = sum % 10;
            carry = sum / 10;
            prev = l1;
            l1 = l1.next;
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }
}