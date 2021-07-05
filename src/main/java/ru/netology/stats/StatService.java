package ru.netology.stats;

public class StatService {

    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result += item;
        }
        return result;
    }

    public long avg(long[] items) {
        return sum(items) / items.length;
    }

    public long getMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public long monthWithMax(long[] items) {
        long max = getMax(items);
        int month = 1;
        int monthWithMax = 0;

        for (long item : items) {
            if (item == max) {
                monthWithMax = month;
            }
            month++;
        }

        return monthWithMax;
    }

    public long getMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public long monthWithMin(long[] items) {
        long min = getMax(items);
        int month = 1;
        int monthWithMin = 0;

        for (long item : items) {
            if (item == min) {
                monthWithMin = month;
            }
            month++;
        }

        return monthWithMin;
    }


    public long monthCountMoreThenAvg(long[] items) {
        long avg = avg(items);
        int count = 0;

        for (long item : items) {
            if (item > avg)
                count++;
        }

        return count;
    }

    public long monthCountLessThenAvg(long[] items) {

        long avg = avg(items);
        int count = 0;

        for (long item : items) {
            if (item < avg)
                count++;
        }

        return count;
    }
}