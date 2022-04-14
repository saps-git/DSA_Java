package com.dsa.questions.leetcode;

//Leetcode-234

//Just reverse the list from middle, and then compare two heads (one from start, one from middle)
public class PalindromeLL {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public boolean isPalindrome(Node head) {
        Node mid = findMid(head);
        Node firstHead = head;
        Node secondHead = reverse(mid); //as second head should start from the mid of the original list, after the
        //second half has been reversed
        while(firstHead != null && secondHead != null) {
            if(firstHead.val != secondHead.val) return false;
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return true;
    }
    public Node findMid(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public Node reverse(Node head) {
        if(head == null) return null;
        Node curr = head, prev = null;
        while(curr.next != null) {
            curr = curr.next;
            head.next = prev;
            prev = head;
            head = curr;
        }

        curr.next = prev;
        return head;
    }*/
}
