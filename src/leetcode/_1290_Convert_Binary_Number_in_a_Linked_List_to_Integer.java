package leetcode;
/*
    1290 - Convert Binary Number in a Linked List to Integer
    Topic: Bit Manipulation / Linked List
    Time: O(n)
    Notes: Initialise an integer with value 0, now at every node, left shift the number by 1 and add current value of node.
*/
public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null){
            result = (result << 1) + head.val;
            head = head.next;
        }
        return result;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
