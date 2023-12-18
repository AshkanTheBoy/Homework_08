package Tasks4;

import java.util.Arrays;

/*
Даны числа
Определить произведение сумм нечетных и четных индексов
 */
public class Task_03 {
    public static void main(String[] args) {
        double[] order = {-1,-1,-1,-2,12,1,17,18};
        printOrder(order);
        printResult(sumProduct(order));
    }

    static double sumProduct(double[] order){
        double evenSum = 0;
        double oddSum = 0;
        for (int i = 0; i < order.length; i+=2) {
            evenSum+= order[i];
            if (i+1 > order.length-1) {
                break;
            } else {
                oddSum+= order[i+1];
            }
        }

        //для проверки
//        System.out.println(evenSum);
//        System.out.println(oddSum);

        return evenSum*oddSum;
    }

    static void printResult(double result) {
        System.out.println(result);
    }

    static void printOrder (double[] order) {
        System.out.println(Arrays.toString(order));
    }
}
