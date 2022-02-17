package com.dsa.questions.leetcode;

//Leetcode-1295

public class EvenDigits {
    //Noobway
//    public static int evenDigits(int[] nums){
//        int ans = 0;
//        for(int i : nums){
//            int digit = 0;
//            while(i > 0){
//                digit++;
//                i = i/10;
//            }
//            if(digit%2 == 0) ans++;
//        }
//        return ans;
//    }

    //Proway
    public static int evenDigits(int[] nums){
        int ans = 0;
        for(int i: nums){
            if(((int)Math.log10(i)+1) % 2 == 0) ans++;
        }
        return ans;
    }

    //100% brain way (Hardcoded)
//    public static int evenDigits(int[] nums){
//        int ans = 0;
//        for(int i: nums){
//            if((i > 9 && i < 100) || i > 999 && i < 10000 || i == 100000)
//                ans++;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,64,7896};
        System.out.print(evenDigits(nums));
    }
}
