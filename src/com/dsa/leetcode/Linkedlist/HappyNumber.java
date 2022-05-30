package com.dsa.leetcode.Linkedlist;

//leetcode-202

/*
A happy number is a number defined by the following process:
        1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
        2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which,
            does not include 1.
        3. Those numbers for which this process ends in 1 are happy.

eg.
    Input: n = 19
    Output: true
    Explanation:
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1
*/

//Treat the question same as checking cycle in a linklist, as after a point, the square of the numbers would start
//repeating itself, giving the hint that they'd never become 1. Hence, if we can detect a cycle, we can say that it's
//not a happy number.

public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        return slow == 1; //return true if slow == 1, or else return false
    }

    public static int findSquare(int num) {
        int ans = 0;
        while(num > 0) {
            int n = num%10;
            ans += n*n;
            num = num/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
