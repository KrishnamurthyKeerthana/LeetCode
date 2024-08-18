package org.example;

public class TimeToBuySellStock {
    public static void main(String[] args){
        int[] prices = {3, 2, 6, 5, 0, 3};
        System.out.println(timeToBuySellStock(prices));
    }
    public static int timeToBuySellStock(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
    }
}
