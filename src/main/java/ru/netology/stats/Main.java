package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        System.out.println(service.sumOfSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.sumOfSalesMid(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.maxProfitMonth(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.minProfitMonth(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.numberOfMonthsBelowMid(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
        System.out.println(service.numberOfMonthsUpperMid(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}));
    }
}