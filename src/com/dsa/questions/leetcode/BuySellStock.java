package com.dsa.questions.leetcode;

//Leetcode-121

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int minSofar = prices[0], maxProfit = 0;
        for(int i=0;i<prices.length;i++) {
            minSofar = Math.min(minSofar, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minSofar);
        }

        return maxProfit;
    }

    //using extra space O(n)
    /*public static int maxProfit(int[] prices) {
        int[] aux = new int[prices.length];
        int maxSofar = 0;
        for(int i=prices.length-1;i>=0;i--) {
            aux[i] = Math.max(maxSofar, prices[i]);
            maxSofar = Math.max(maxSofar, aux[i]);
        }

        int maxProfit = 0;
        for(int i=0;i<prices.length;i++) {
            int profit = aux[i] - prices[i];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }*/
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}