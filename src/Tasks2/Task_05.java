package Tasks2;

public class Task_05 {
    //((1/3)*x)-((1*...*(3i-2)/3*...*3i)*x^i)
    public static void main(String[] args) {
        //1-й аргумент - длина ряда, 2-й - число 'x'
        double sum = summarize(4, -1);
        printSum(sum);
    }

    static double summarize(int size, double x) {
        double sum = 0;
        double upperNumber = 1;
        double lowerNumber = 1;

        for (double i = 1; i <= size; i++) {
            upperNumber *= 3*i-2;
            lowerNumber *= 3*i;

            //для проверки
//            System.out.println("CURRENT SUM: "+sum);
//            System.out.println("CURRENT UPPERNUMBER: "+upperNumber);
//            System.out.println("CURRENT LOWERNUMBER: "+lowerNumber);
//            if (i % 2 == 0) {
//                System.out.println("CURRENT SUBTRAHEND: "+ upperNumber / lowerNumber * (Math.pow(x,i)));
//            } else {
//                System.out.println("CURRENT SUMMAND: "+ upperNumber / lowerNumber * (Math.pow(x,i)));
//            }
//            System.out.println();

            //каждый четный шаг отнимаем, нечетный - прибавляем
            if (i % 2 == 0) {
                sum -= upperNumber / lowerNumber * (Math.pow(x,i));;
            } else {
                sum += upperNumber / lowerNumber * (Math.pow(x,i));;
            }
        }
        return sum;
    }

    static void printSum(double sum) {
        System.out.println();
        System.out.println("FINAL SUM: " + sum);
    }
}
