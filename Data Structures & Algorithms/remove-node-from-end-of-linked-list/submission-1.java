/**
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total=0;

        ListNode curr=head;


        while(curr!=null){
            curr=curr.next;
            total++;
        }
        if (n == total) {
            return head.next;
        }
        int i;
        ListNode temp=head;
        for(i=1;i<total-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;


    }
}
