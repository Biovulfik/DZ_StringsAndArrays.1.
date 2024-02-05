package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public long averageSum(long[] data) {
        long average = sumSales(data);
        return average / data.length;
    }

    public int maximumSales(long[] data) {
        int maxMonth = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= data[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minimumSales(long[] data) {
        int minMonth = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= data[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthAverageMax(long[] data) {
        long monthAverageMax = averageSum(data);
        int maxAverage = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > monthAverageMax) {
                maxAverage++;
            }
        }
        return maxAverage;

    }

    public int monthAverageMin(long[] data) {
        long monthAverageMin = averageSum(data);
        int minAverage = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < monthAverageMin) {
                minAverage++;
            }
        }
        return minAverage;

    }

}
