/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>map=new HashMap<>();
        // creatning the map
        Node curr=head;
        while(curr!=null){
            map.put(curr, new Node (curr.val));
             curr = curr.next;    
        }

        // building connections for next and random
        Node duplicateHead=map.get(head);

        curr=head;
        Node curr2=duplicateHead;

        while(curr!=null){
            curr2.next=map.get(curr.next);
            curr2.random=map.get(curr.random);

            curr=curr.next;
            curr2=curr2.next;
        }
        return duplicateHead;

    }
}
