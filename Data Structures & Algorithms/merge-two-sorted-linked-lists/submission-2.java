
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                curr=curr.next;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                curr=curr.next;
                list2=list2.next;
            }
        }

        if(list1==null){
            curr.next=list2;
        }
        else{
            curr.next=list1;
        }
        return dummy.next;
    }
}