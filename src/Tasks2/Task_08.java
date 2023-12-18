package Tasks2;

public class Task_08 {
    // (((2x)^2)/2!) -+...(((2x)^2i)/((2i)!))+-... (x<1)
    public static void main(String[] args) {
        //1-й аргумент - длина ряда, 2-й - число 'x'
        printSum(summarize(3, -1));
    }

    static double summarize(int size, double x) {
        double sum = 0;
        double upperNumber;
        double lowerNumber;

        for (double i = 1; i <= size; i++) {
            upperNumber = Math.pow(2*x,2*i);
            lowerNumber = factorial((2*i));

            //для проверки
//            System.out.println("CURRENT SUM: "+sum);
//            System.out.println("CURRENT FACTORIAL :"+factorial((2*i)));
//            System.out.println("CURRENT UPPERNUMBER: "+upperNumber);
//            System.out.println("CURRENT LOWERNUMBER: "+lowerNumber);
//            if (i % 2 == 0) {
//                System.out.println("CURRENT SUBTRAHEND: "+ upperNumber / lowerNumber);
//            } else {
//                System.out.println("CURRENT SUMMAND: "+ upperNumber / lowerNumber);
//            }
//            System.out.println();

            //каждый четный шаг отнимаем, нечетный - прибавляем
            if (i % 2 == 0) {
                sum -= upperNumber / lowerNumber;
            } else {
                sum += upperNumber / lowerNumber;
            }
        }
        return sum;
    }

    static double factorial(double num) {
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void printSum(double sum) {
        System.out.println();
        System.out.println("FINAL SUM: " + sum);
    }
}
