package Tasks4;

import java.util.Arrays;

public class Task_06 {
    public static void main(String[] args) {
        int[] order1 = {1,2,3,4,5,6,7};
        int[] order2 = {2,3,4,5,6};

        printOrders(order1, order2);
        printResult(isItSub(order2,order1));

    }

    static boolean isItSub (int[] order2, int[] order1) {
        for (int i = 0; i < order1.length; i++) {
            if (order2[0]==order1[i]) {
                for (int j = 0; j < order2.length; j++) {
                    if (order1[i+j]!=order2[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static void printResult(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("IT IS A SUBSEQUENCE");
        } else {
            System.out.println("IT IS NOT A SUBSEQUENCE");
        }
    }

    static void printOrders(int[] order1, int[] order2) {
        System.out.println(Arrays.toString(order1));
        System.out.println(Arrays.toString(order2));
    }
}
