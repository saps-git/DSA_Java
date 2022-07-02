package com.dsa.leetcode.Linkedlist;

public class CloneLL {
    //TODO: STRAIGHT UP RUN IT ON LEETCODE

    //Smartway, Time - O(2N), as we iterate the LL twice, Space - O(N)

    //We use a hashmap to store all the nodes, and their corresponding a copy of the nodes for the answer List
    //Then we iterate again over the LL, and assign the next & random pointers(nodes) to the corresponding node of the
    //current node in the answer list.
    //Finally, we return the corresponding node of the head from the map

    /*public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();
        Node temp = head;
        while(temp != null) {
            mp.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            Node ans = mp.get(temp);
            ans.next = mp.get(temp.next);
            ans.random = mp.get(temp.random);
            temp = temp.next;
        }

        return mp.get(head);
    }*/

    //Proway, Time - O(N)
    /*public Node copyRandomList(Node head) {
        if(head==null) return head;

        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        Node curr = head;
        while(curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }

        // Second round: assign random pointers for the copy nodes.
        curr = head;
        while(curr != null) {
            if(curr.random != null) curr.next.random = curr.random.next;

            curr = curr.next.next;
        }

        // Third round: restore the original list, and extract the copy list.
        Node org = head, copy = head.next;
        Node ans = copy;
        while(copy.next != null) {
            org.next = org.next.next;
            copy.next = copy.next.next;
            org = org.next;
            copy = copy.next;
        }
        org.next = null;

        return ans;
    }*/
}
