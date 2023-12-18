package Tasks2;

public class Task_06 {
    // (1/x^2)+-((X^2i)/(2i+2))-+... (x<1)
    public static void main(String[] args) {
        //1-й аргумент - длина ряда, 2-й - число 'x'
        printSum(summarize(3, -1));
    }

    static double summarize(int size, double x) {
        if (size<=0){
            return 0;
        }
        double sum = 1/x*x;
        double upperNumber;
        double lowerNumber;

        for (double i = 1; i < size; i++) {
            upperNumber = Math.pow(x,2*i);
            lowerNumber = factorial((2*i+2));

            //для проверки
//            System.out.println("CURRENT SUM: "+sum);
//            System.out.println("CURRENT FACTORIAL :"+factorial((2*i+2)));
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
