package ru.netology.stats;

public class StatsService {
    public int totalSalesByMonth(int[] sales) {

        int total = 0;
        for (int i = 0; i < sales.length; i++) { //перебираем месяца по порядку
            total = total + sales[i];
        }

        return total;
    }

    public int midSalesByMonth(int[] sales) {
        int mid = 0;
        for (int i = 0; i < sales.length; i++) { //перебираем месяца по порядку
            mid = totalSalesByMonth(sales) / 12;
        }
        return mid;

    }

    public int maxSalesByMonth(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minSalesByMonth(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int lowMidSalesByMonth(int[] sales) {
        int lowMid = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midSalesByMonth(sales)) {
                lowMid = lowMid + 1;
            }

        }
        return lowMid;

    }

    public int HiMidSalesByMonth(int[] sales) {
        int hiMid = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midSalesByMonth(sales)) {
                hiMid = hiMid + 1;
            }

        }
        return hiMid;

    }
}

