package com.cognizant.algorithms;

public class FinancialForecasting {

    // Calculate average growth rate between consecutive values
    public static double calculateGrowthRate(double[] pastData) {
        double totalGrowthRate = 0;
        int count = 0;

        for (int i = 1; i < pastData.length; i++) {
            double growth = (pastData[i] - pastData[i - 1]) / pastData[i - 1];
            totalGrowthRate += growth;
            count++;
        }

        return totalGrowthRate / count; // average growth rate
    }

    // Forecast future values based on growth rate
    public static double[] forecast(double[] pastData, int futureMonths) {
        double growthRate = calculateGrowthRate(pastData);
        double[] forecastedData = new double[futureMonths];

        double lastValue = pastData[pastData.length - 1];

        for (int i = 0; i < futureMonths; i++) {
            lastValue = lastValue + (lastValue * growthRate);
            forecastedData[i] = lastValue;
        }

        return forecastedData;
    }

    public static void main(String[] args) {
        // Past 4 months revenue (in thousands)
        double[] pastRevenue = {100, 110, 121, 133.1};

        System.out.println("Past Revenue Data:");
        for (double value : pastRevenue) {
            System.out.printf("%.2f  ", value);
        }
        System.out.println();

        double growthRate = calculateGrowthRate(pastRevenue);
        System.out.printf("Average Growth Rate: %.2f%%\n", growthRate * 100);

        // Forecast next 3 months
        double[] forecasted = forecast(pastRevenue, 3);

        System.out.println("\nForecasted Revenue for next 3 months:");
        for (int i = 0; i < forecasted.length; i++) {
            System.out.printf("Month %d: %.2f\n", (i + 1), forecasted[i]);
        }
    }
}