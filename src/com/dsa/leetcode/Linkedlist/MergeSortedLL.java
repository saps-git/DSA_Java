package com.dsa.leetcode.Linkedlist;

//Leetcode-21

public class MergeSortedLL {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public Node mergeTwoLists(Node head1, Node head2) {
        Node curr1 = head1, curr2 = head2;
        Node sol = new Node();
        Node temp = sol;
        while(curr1 != null && curr2 != null) {
            if(curr1.data < curr2.data) {
                sol.next = curr1;
                curr1 = curr1.next;
            } else {
                sol.next = curr2;
                curr2 = curr2.next;
            }
            sol = sol.next;
        }

        while(curr1 != null) {
            sol.next = curr1;
            curr1 = curr1.next;
            sol = sol.next;
        }
        while(curr2 != null) {
            sol.next = curr2;
            curr2 = curr2.next;
            sol = sol.next;
        }
        return temp.next;
    }

    public void display(Node res) {
        Node temp = res;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        LLTemplate linkedList = new LLTemplate();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(4);

        LLTemplate linkedList2 = new LLTemplate();
        linkedList2.insert(1);
        linkedList2.insert(3);
        linkedList2.insert(4);

        LLTemplate ans = new LLTemplate();
        Node res = ans.mergeTwoLists(linkedList.head, linkedList2.head);
        ans.display(res);
    }*/
}
