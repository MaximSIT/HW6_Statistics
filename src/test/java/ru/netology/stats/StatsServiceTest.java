package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testForSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForSalesMid() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.sumOfSalesMid(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForMaxProfitMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxProfitMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForMinProfitMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minProfitMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForNumberOfMonthsBelowMid() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthsBelowMid(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForNumberOfMonthsUpperMid() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberOfMonthsUpperMid(sales);
        Assertions.assertEquals(expected, actual);
    }
}