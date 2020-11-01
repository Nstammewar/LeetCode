

/**
# Convert Binary Number in a Linked List to Integer

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;    
        }
        return num;
    }
}


/**  using inbuild library

 public int getDecimalValue(ListNode head) {
        String binary = new String();
        while(head != null) {
            binary += head.val + "";
            head = head.next;
        }
        return Integer.parseInt(binary, 2);
    }


 */
