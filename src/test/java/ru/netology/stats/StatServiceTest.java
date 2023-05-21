package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual;
        actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void averageAmountSalesPerMonth() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual;
        actual = (int) service.calcAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void numberMonthSalesMinAmount() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual;
        actual = (int) service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void numberMonthSalesMaxAmount() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual;
        actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void aboveAverageSale() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual;
        actual = service.aboveAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void belowAverageSale() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual;
        actual = service.belowAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }
}

