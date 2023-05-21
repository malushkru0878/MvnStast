package ru.netology.stats;
public class StatService {
    public int calculateSum(int[] sales) { //подсчет суммы продаж
        int sum = 0; //переменная для суммы
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcAverageSum(int[] sales) {// полдсчет средней суммы продаж в месяц
        long averageSum = calculateSum(sales) / sales.length;
        return averageSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int aboveAverageSum(int[] sales) {// подсчет кол-ва месяцев, в которых продажи были выше среднего
        double averageSum = calcAverageSum(sales);
        int aboveAverageSale = 0;
        for (int sale : sales) {
            if (sale > averageSum) {
                aboveAverageSale += 1;
            }
        }
        return aboveAverageSale;
    }

    public int belowAverageSum(int[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего

        double averageSum = calcAverageSum(sales);
        int belowAverageSale = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale < averageSum) {
                belowAverageSale += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
            }
        }
        return belowAverageSale;

    }

}





