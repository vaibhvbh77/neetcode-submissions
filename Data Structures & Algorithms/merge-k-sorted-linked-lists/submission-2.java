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
    public ListNode mergeKLists(ListNode[] lists) {

        // lists
//   ↓
// ┌─────────┬─────────┬─────────┐
// │ lists[0]│ lists[1]│ lists[2]│
// └────┬────┴────┬────┴────┬────┘
//      ↓         ↓         ↓
//     1→4→5    1→3→4     2→6
// SOLUTIONS
// NAIVE
// 1 → 4 → 5
// 1 → 3 → 4
// 2 → 6

// You could take all the values:

// 1, 4, 5, 1, 3, 4, 2, 6

// Sort them:

// 1, 1, 2, 3, 4, 4, 5, 6

// Then create a linked list.

// That's one possible approach.

// But there is a better approach because each individual list is already sorted.

// ArrayList<Integer>list=new ArrayList<>();
// for(int i=0;i<lists.length;i++){
//     // lists[0]
//     ListNode curr=lists[i];
//     while(curr!=null){
//         list.add(curr.val);
//         curr=curr.next;
//     }
// }
// Collections.sort(list);

// ListNode dummy = new ListNode(0);
// ListNode curr = dummy;

// for (int i = 0; i < list.size(); i++) {

//     curr.next = new ListNode(list.get(i));
//     curr = curr.next;
// }

// return dummy.next;

// ------------

// Efficient

PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);

    // comparator is used to compare on basis on value of the node 
    // by default pq is min heap

for(int i=0;i<lists.length;i++){
    pq.add(lists[i]);
}
   ListNode dummy=new ListNode(0);
   ListNode curr = dummy;

   while(!pq.isEmpty()){
    ListNode out=pq.poll();
    curr.next=out;
    curr=out;

    if(out.next!=null){
        pq.add(out.next);
    }

   }




return dummy.next;


    }
}
