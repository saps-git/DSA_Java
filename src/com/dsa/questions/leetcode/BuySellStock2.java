package com.dsa.questions.leetcode;

//Leetcode-122

public class BuySellStock2 {

    //taking into consideration the local minima (lowest price) and local maxima (highest price)
/*    public static int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while(i < prices.length-1) {
            while(i < prices.length-1 && prices[i] >= prices[i+1]) i++; //prices going down
            int buy = prices[i]; //when price the lowest buy the stock
            while(i < prices.length-1 && prices[i] <= prices[i+1]) i++; //prices going up
            int sell = prices[i]; //when price the highest sell the stock

            profit += sell - buy; //add the profit made to the total profit
        }

        return profit;
    }*/

    //this can be done in a simpler way also, where we sell each time we make profit (i.e prices[i] < prices[i+1]),
    //as all the different profits made would anyway add up to the total profit made
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length-1;i++) {
            if(prices[i] < prices[i+1]) {
                profit += prices[i+1] - prices[i];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
