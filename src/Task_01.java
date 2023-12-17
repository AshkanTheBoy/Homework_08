
public class Task_01 {
    //x-(2/6)*(x^2)+((2*5)/(6*9))*(x^3)-...| (X<1)
    public static void main(String[] args) {
        //size - длина ряда
        double sum = summarize(6,-5);
        printSum(sum);
    }

    static double summarize(int size, double x) {
        double sum = x;
        double upperNumber = 1;
        double lowerNumber = 1;

        for (double i = 1; i < size; i++) {
            if (size <= 1) {
                return sum;
            } else {
                upperNumber *= (3*(i+1)-4);
                lowerNumber *= (3*(i+1));

                //для проверки
//                System.out.println("CURRENT SUM: "+sum);
//                System.out.println("CURRENT UPPERNUMBER: "+upperNumber);
//                System.out.println("CURRENT LOWERNUMBER: "+lowerNumber);
//                System.out.println("CURRENT SUBTRAHEND: "+ upperNumber / lowerNumber * Math.pow(x,(i+1)));

                //каждый второй шаг будет происходить суммирование и знак будет равен знаку числа 'x'
                if (i%2==0) {
                    sum = -sum;
                    sum += -(upperNumber / lowerNumber * Math.pow(x,(i+1)));
                    sum = -sum;
                } else {
                    sum -= upperNumber / lowerNumber * Math.pow(x,(i+1));
                }
            }
        }
        return sum;
    }
    static void printSum (double sum){
        System.out.println();
        System.out.println("FINAL SUM: " + sum);
    }
}
