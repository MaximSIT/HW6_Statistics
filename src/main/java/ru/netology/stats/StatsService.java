package ru.netology.stats;

public class StatsService {
    public int sumOfSales(int[] sales) {
        int sale = 0;
        for (int i = 0; i < sales.length; i++) {
            sale = sales[i] + sale;
        }
        return sale;
    }

    public int sumOfSalesMid(int[] sales) {
        int sumMid = sumOfSales(sales) / sales.length;
        return sumMid;
    }

    public int maxProfitMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minProfitMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfMonthsBelowMid(int[] sales) {
        int numberLowestMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumOfSalesMid(sales)) {
                numberLowestMonths = numberLowestMonths + 1;
            }
        }
        return numberLowestMonths;
    }

    public int numberOfMonthsUpperMid(int[] sales) {
        int numberHighestMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumOfSalesMid(sales)) {
                numberHighestMonths = numberHighestMonths + 1;
            }
        }
        return numberHighestMonths;
    }
}