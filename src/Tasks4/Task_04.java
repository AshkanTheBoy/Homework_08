package Tasks4;

import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {
        int[] order = {-1,-1,18,-2,18,-2,15,18,7};
        printOrder(order);
        order = sortOrder(order);
        printOrder(order);
        printResult(uniqNumsAvrg(order));
    }

    static double uniqNumsAvrg(int[] order){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < order.length; i++) {
            int number = order[i];

            if (i+1>= order.length) {
                //для проверки
//                System.out.println(number);
                sum+=number;
                count++;
//                System.out.println("FINAL SUM: "+sum);
//                System.out.println("FINAL COUNT: "+count);
                break;
            } else {
                if (number==order[i+1]){
                    continue;
                } else {
//                    System.out.println(number);
                    sum+= number;
                    count++;
//                    System.out.println("SUM: "+sum);
//                    System.out.println("CURRENT COUNT: "+count);
                }
            }
        }
//        System.out.println();
//        System.out.println("RESULT: "+sum/count);
        return sum/count;
    }

    static void printOrder (int[] order) {
        System.out.println(Arrays.toString(order));
    }

    static int[] sortOrder (int[] order){
        return Arrays.stream(order).sorted().toArray();
    }

    static void printResult(double result) {
        System.out.println("AVERAGE OF UNIQUE NUMBERS IN A GIVEN ORDER IS: "+result);
    }
}
