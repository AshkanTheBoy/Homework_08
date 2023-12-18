package Tasks2;

public class Task_01 {
    //x-(2/6)*(x^2)+((2*...*(3i-4)/(6*...*3i))*(x^3)-...| (X<1)
    public static void main(String[] args) {
        //1-й аргумент - длина ряда, 2-й - число 'x'
        double sum = summarize(4, -1);
        printSum(sum);
    }

    static double summarize(int size, double x) {
        if (size<=0){
            return 0;
        }
        /*в данном случае нельзя вычислить первый элемент,
        так как, по формуле, все последующие элементы окажутся неверными
        ((-1/3)*x)-(2/18)*x^2...
        поэтому вычисление начинается со второго элемента
         */
        double sum = x;
        double upperNumber = 1;
        double lowerNumber = 1;

        for (double i = 1; i < size; i++) {
            upperNumber *= (3*(i+1)-4);
            lowerNumber *= (3*(i+1));

            //для проверки
//            System.out.println("CURRENT SUM: " + sum);
//            System.out.println("CURRENT UPPERNUMBER: " + upperNumber);
//            System.out.println("CURRENT LOWERNUMBER: " + lowerNumber);
//            if (i % 2 == 0) {
//                System.out.println("CURRENT SUMMAND: "+ upperNumber / lowerNumber * Math.pow(x, (i + 1)));
//            } else {
//                System.out.println("CURRENT SUBTRAHEND: "+ upperNumber / lowerNumber * Math.pow(x, (i + 1)));
//            }
//            System.out.println();

            //каждый четный шаг - суммируем, нечетный - отнимаем
            if (i % 2 == 0) {
                sum += upperNumber / lowerNumber * Math.pow(x, (i + 1));
            } else {
                sum -= upperNumber / lowerNumber * Math.pow(x, (i + 1));
            }
        }
        return sum;
    }

    static void printSum(double sum) {
        System.out.println();
        System.out.println("FINAL SUM: " + sum);
    }
}
