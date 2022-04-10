package com.dsa.linkedlist;

//Same as merge sort on arrays, only to take care of the left and right, see comments.
//If you still don't get it look at Nick White's YT video

public class MergeSortLL {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public Node sort(Node head) {
        if(head == null || head.next == null) //base case: if single or no element left in LL, return the element, i.e. head
            return head;

        Node beforeMid = beforemidElement(head); //find the element before mid, as this will be the end point of left part of LL,
        // and mid will be the starting part of the right LL

        Node right = beforeMid.next; //as right LL should start from mid(next element after beforeMid) to end
        Node left = head; //as left node should start from head(first element) to mid-1
        beforeMid.next = null; //hence, making the next element of beforeMid as null, as to cut of the link, making this a
        //separate LL (left LL)

        //calling the sort method on both left, and right LL
        left = sort(left);
        right = sort(right);

        return mergeList(left, right); //while returning merging the now sorted left and right LL
    }

    //this function will return the element before mid, as there we will cut the LL into two halves
    public Node beforemidElement(Node head) {
        Node prev = head, slow = head, fast = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev; //returning the element before mid, as this will be the end point of left part of LL, and
        //mid will be the starting part of the right LL
    }

    public Node mergeList(Node head1, Node head2) {
        Node curr1 = head1, curr2 = head2;
        Node sol = new Node();
        Node temp = sol;
        while (curr1 != null && curr2 != null) {
            if (curr1.data < curr2.data) {
                sol.next = curr1;
                curr1 = curr1.next;
            } else {
                sol.next = curr2;
                curr2 = curr2.next;
            }
            sol = sol.next;
        }

        while (curr1 != null) {
            sol.next = curr1;
            curr1 = curr1.next;
            sol = sol.next;
        }
        while (curr2 != null) {
            sol.next = curr2;
            curr2 = curr2.next;
            sol = sol.next;
        }
        return temp.next;
    }*/
}
