package Tasks4;

import java.util.Arrays;

/*
Даны числа
Определить произведение ср. арифм-их положительных и отрицательных чисел
 */
public class Task_02 {
    public static void main(String[] args) {
        double[] order = {-1,-5,-10,115,12,1,17};
        printOrder(order);
        printResult(averagesProduct(order));
    }

    static double averagesProduct(double[] order){
        double plusSum = 0;
        int plusCount = 0;
        double minusSum = 0;
        int minusCount = 0;
        for (double unit: order) {
            if (unit<0) {
                minusSum += unit;
                minusCount++;
            } else {
                plusSum += unit;
                plusCount++;
            }
        }
        double plusAvrg = plusSum/plusCount;
        double minusAvrg = minusSum/minusCount;

        //для проверки
//        System.out.println(plusAvrg);
//        System.out.println(minusAvrg);

        return plusAvrg*minusAvrg;
    }

    static void printResult(double result) {
        System.out.println(result);
    }

    static void printOrder (double[] order) {
        System.out.println(Arrays.toString(order));
    }
}
