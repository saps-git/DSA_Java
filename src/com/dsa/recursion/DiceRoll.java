package com.dsa.recursion;

//Rolling a(single) dice, return the possible outcomes that add unto the target

import java.util.ArrayList;
import java.util.List;

//We will simply add a number to ans and remove the number from target, when target becomes zero, we have a possible soln
public class DiceRoll {
    public static void main(String[] args) {
        int target = 4;
        diceRoll("", target);
        System.out.println(diceRet("", target));
    }
    public static void diceRoll(String ans, int target) {
        if(target == 0) {
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=6 && i<=target;i++) { //i<=target, because, ans can't consist value more than target
            diceRoll(ans+i, target-i);
        }
    }
    //Returning as a list
    static List<String> diceRet(String p, int target) {
        if (target == 0) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}
