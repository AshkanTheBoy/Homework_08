package Tasks2;

public class Task_11 {
    // 1-(5/2*x)+-(5*...*(2i+3)/2*...*2i)-+ (x<1)
    public static void main(String[] args) {
        //1-й аргумент - длина ряда, 2-й - число 'x'
        double sum = summarize(4, 0.5);
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
        double sum = 1;
        double upperNumber = 1;
        double lowerNumber = 1;

        for (double i = 1; i < size; i++) {
            upperNumber *= (2*i+3);
            lowerNumber *= (2*i);

            //для проверки
//            System.out.println("CURRENT SUM: " + sum);
//            System.out.println("CURRENT UPPERNUMBER: " + upperNumber);
//            System.out.println("CURRENT LOWERNUMBER: " + lowerNumber);
//            if (i % 2 == 0) {
//                System.out.println("CURRENT SUMMAND: "+ upperNumber / lowerNumber * Math.pow(x,i));
//            } else {
//                System.out.println("CURRENT SUBTRAHEND: "+ upperNumber / lowerNumber * Math.pow(x,i));
//            }
//            System.out.println();

            //каждый четный шаг - суммируем, нечетный - отнимаем
            if (i % 2 == 0) {
                sum += upperNumber / lowerNumber * Math.pow(x,i);
            } else {
                sum -= upperNumber / lowerNumber * Math.pow(x,i);
            }
        }
        return sum;
    }

    static void printSum(double sum) {
        System.out.println();
        System.out.println("FINAL SUM: " + sum);
    }
}
