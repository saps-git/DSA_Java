package com.dsa.leetcode.Linkedlist;

//Leetcode-2

public class Add2Numbers {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public LLTemplate.Node addTwoNumbers(LLTemplate.Node l1, LLTemplate.Node l2) {
        LLTemplate.Node dummy = new LLTemplate.Node();
        LLTemplate.Node temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.data : 0;
            int val2 = (l2 != null) ? l2.data : 0;
            int ans = val1 + val2 + carry;
            carry = ans/10;
            ans %= 10;
            dummy.next = new LLTemplate.Node(ans);
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            dummy = dummy.next;
        }

        if(carry > 0) dummy.next = new LLTemplate.Node(1);

        return temp.next;
    }
    public static void main(String[] args) {
        LLTemplate linkedList = new LLTemplate();
        linkedList.insert(2);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(3);

        LLTemplate linkedList2 = new LLTemplate();
        linkedList2.insert(5);
        linkedList2.insert(6);
        linkedList2.insert(4);

        LLTemplate ans = new LLTemplate();
        LLTemplate.Node res = ans.addTwoNumbers(linkedList.head, linkedList2.head);
        ans.display(res);
    }*/
}
