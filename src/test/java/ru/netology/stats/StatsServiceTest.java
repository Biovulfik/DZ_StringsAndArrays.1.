package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calculationOfTheAmount() {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sumSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculationAverageAmount() {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSum(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOfMaximumSales() {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maximumSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOfMinimumSales() {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.minimumSales(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOfSalesAboveAverage() {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthAverageMax(data);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOfSalesBelowAverage() {
        long[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.monthAverageMin(data);
        Assertions.assertEquals(expected, actual);
    }


}
