import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {

    }

//    static double summarize(int size){
//        Random random = new Random();
//        double x = random.nextDouble();
//        double sum;
//        double upperNumber;
//        for (double i = 1; i <= size; i++) {
//            //для проверки
////            System.out.println("CURRENT MINUEND: "+sum);
////            System.out.println("CURRENT SUBTRAHEND: "+(upperNumber*(3*i-4)) / (lowerNumber*(3*i)) * Math.pow(x,i));
//            sum -= (upperNumber*(3*i-4)) / (lowerNumber*(3*i)) * Math.pow(x,i);
//            sum = -sum;
//
//        }
//        return sum;
//    }

    static double factorial(double num) {
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
        return factorial;
    }

}
