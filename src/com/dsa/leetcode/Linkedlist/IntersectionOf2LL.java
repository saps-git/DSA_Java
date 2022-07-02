package com.dsa.leetcode.Linkedlist;

//Leetcode-160

public class IntersectionOf2LL {
    //TODO: STRAIGHT UP RUN IT ON LEETCODE, BECAUSE WE CAN'T MAKE THE LL REQUIRED HERE

    /*
    If you believe a common attribute is a node’s value, then think properly! If we take our example 1, there we can see
    both lists have nodes of value 3. But it is not the first intersection node. So what’s the common attribute?
    It is the node itself that is the common attribute.
     */

    //Noobway - O(m * n) where m & n are the lengths of the two LL

    //Keep any one of the list to check its node present in the other list.
    // Here, we are choosing the second list for this task.
    //Iterate through the other list. Here, it is the first one.
    //Check if the both nodes are the same. If yes, we got our first intersection node.
    //If not, continue iteration.
    //If we did not find an intersection node and completed the entire iteration of the second list,
    // then there is no intersection between the provided lists. Hence, return null.
    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headB != null) {
            ListNode temp = headA;
            while(temp != null) {
                if(temp == headB) return temp;
                temp = temp.next;
            }
            headB = headB.next;
        }

        return null;
    }*/

    //Smartway - O(m + n) where m & n are the lengths of the two LL
    //But here we will be using up extra space O(m) as we use HashSet to store values of one LL

    //Iterate through list 1 and hash its node address.
    //Iterate through list 2 and search the hashed value in the hash table. If found, return node.

    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(set.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }*/

    //Proway - O(m + n) where m & n are the lengths of the two LL
    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA, n2 = headB;
        while(n1 != n2) {
            n1 = (n1 != null) ? n1.next : headB;
            n2 = (n2 != null) ? n2.next : headA;
        }

        return n1;
    }*/
}
