package ru.netology.javaqa.javamvnci.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    public void FindMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void FindMaxSecondBranch() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 35, 8, 6, 11, 11, 12};

        long expected = 35;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }
}
