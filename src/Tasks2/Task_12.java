package Tasks2;

public class Task_12 {
    // 2*x/1! -...-+ (((i+1)x^i)/i!)+- (x<1)
    public static void main(String[] args) {
        //1-й аргумент - длина ряда, 2-й - число 'x'
        printSum(summarize(4, 0.5));
    }

    static double summarize(int size, double x) {
        double sum = 0;
        double upperNumber;
        double lowerNumber;

        for (double i = 1; i <= size; i++) {
            upperNumber = (i+1)*Math.pow(x,i);
            lowerNumber = factorial(i);

            //для проверки
//            System.out.println("CURRENT SUM: "+sum);
//            System.out.println("CURRENT FACTORIAL :"+factorial(i));
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
