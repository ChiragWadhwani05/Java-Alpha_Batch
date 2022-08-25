class stockprice {
    public static void calculateprofit(int prices[]) {
        int buyingprice = Integer.MAX_VALUE;
        int profit = 0;
        int sellingprice = 0;
        for (int i = 0; i < prices.length; i++) {
            buyingprice = Math.min(buyingprice, prices[i]);
            if (buyingprice < prices[i]) {
                profit = Math.max(profit, prices[i] - buyingprice);
                sellingprice = Math.max(sellingprice, prices[i]);
            }
        }
        if (sellingprice == 0) {
            System.out.println("NO PROFIT ON THIS STOCK");
        } else {
            System.out.println("MINIMUM BUYING PRICE = " + buyingprice);
            System.out.println("MAXIMUM SELLING PRICE = " + sellingprice);
            System.out.println("MAXIMUM PROFIT = " + profit);
        }
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        calculateprofit(prices);
    }

}