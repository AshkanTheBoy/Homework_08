package Tasks4;

import java.util.Arrays;

public class Task_05 {
    public static void main(String[] args) {
        int[] order = {-3,-8,-4,-6,0,6,12};
        System.out.println("INITIAL ORDER: "+Arrays.toString(order));

        order = sortOrder(order);

        printOrderParams(order);
        System.out.println("SORTED ORDER: "+Arrays.toString(order));

        double[] realOrder = getRealOrder(order);
        System.out.println("REQUIRED SEQUENCE: "+Arrays.toString(realOrder));

        printWrongElements(order);

    }

    static int[] sortOrder (int[] order){
        return Arrays.stream(order).sorted().toArray();
    }

    static double getMaxNum (int[] order) {
        return order[order.length-1];
    }

    static int getMinNum (int[] order) {
        return order[0];
    }

    static double getSequence (int[] order) {
        return (getMaxNum(order)-getMinNum(order))/(order.length-1);
    }

    static void printOrderParams (int[] order) {
        System.out.println("MAX NUM: "+getMaxNum(order));
        System.out.println("MIN NUM: "+getMinNum(order));
        System.out.println("ELEMENTS IN SEQUENCE: "+order.length);
        System.out.println("REQUIRED DIFFERENCE: "+getSequence(order));
    }

    static double[] getRealOrder (int[] order) {
        double[] realOrder = new double[order.length];
        Arrays.fill(realOrder, getMinNum(order));
        for (int i = 0; i < realOrder.length; i++) {
            realOrder[i]+= getSequence(order)*i;
        }
        return realOrder;
    }

    static void printWrongElements(int[] order) {
        System.out.print("WRONG ELEMENTS: ");
        for (int i = 0; i < getRealOrder(order).length; i++) {
            if (order[i]!=getRealOrder(order)[i]) {
                System.out.print(order[i]+" ");
            }
        }
    }
}
