package Tasks4;
/*
Дана последовательность.
Определить, является ли оно возрастающей последовательностью простых чисел
 */
import java.util.Arrays;

public class Task_01 {
    public static void main(String[] args) {
        int[] order =  createOrder();
        printOrder(order);
        printResult(areAllPrimes(order), areUnitsBigger(order));
    }

    static boolean areAllPrimes(int[] order) {
        for (int unit : order){
            if (unit==1 || ((unit!=2 && unit!=3) && (unit%2==0 || unit%3==0))) {
                return false;
            }
        }
        return true;
    }

    static boolean areUnitsBigger (int[] order) {
        for (int i = 0; i < order.length-1; i++) {
            if (order[i]>=order[i+1]){
                return false;
            }
        }
        return true;
    }

    static void printOrder (int[] order) {
        System.out.println(Arrays.toString(order));
    }
    static void printResult(boolean result1, boolean result2) {
        System.out.println(result1&&result2);
    }

    static int[] createOrder () {
        int[] order = {2,3,5,7,11,13};
        //int[] order = {1,2,3,4,5,6,7,8,9,10};
        return order;
    }
}
