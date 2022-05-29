package com.dsa.questions.leetcode.Arrays;

//Leetcode-169

import java.util.HashMap;

//Moore's voting algorithm - take the starting element as the answer, and then start traversing the array,
// if you find any other occurrence of the element, incr the answer +1, if any other decr the answer -1, if it becomes 0,
// make the current element as new answer.
//Finally, after exiting the loop, run the loop once more and count the occurrence, to confirm the answer
public class MajorityElement {
    //using Moore's voting algorithm
    public static int majorityElement(int[] nums) {
        int count = 0, ans = nums[0];
        for(int i: nums) {
            if(count == 0) ans = i;
            if (i == ans) count ++;
            else count --;
        }

        //return ans

        //you can submit the above code on leetcode as it says,
        // "You may assume that the majority element always exists in the array", the below loop is just to make sure
        //that the element is actually in majority
        int sol = 0;
        for(int i: nums) {
            if(i == ans) sol++;
        }

        if(sol > nums.length/2) return ans;

        return 0;
    }
    //Using extra space
/*    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
            if(map.get(i) > nums.length/2) return i;
        }

        return 0;
    }*/
    public static void main(String[] args) {
        int[] nums =  {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
