import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        //x-(2/6)*(x*x)+(10/54)*(x*x*x)-...| (X<1)
        //2/6 - 10/54 - 80/648
        double sum = summarize(5);
        printSum(sum);
    }
    
    static double summarize(int size){
        Random random = new Random();
        double x = random.nextDouble();
        double sum = x;
        double upperNumber = 1;
        double lowerNumber = 1;
        for (double i = 2; i <= size; i++) {
            //для проверки
//            System.out.println("CURRENT MINUEND: "+sum);
//            System.out.println("CURRENT SUBTRAHEND: "+(upperNumber*(3*i-4)) / (lowerNumber*(3*i)) * Math.pow(x,i));
            sum -= (upperNumber*(3*i-4)) / (lowerNumber*(3*i)) * Math.pow(x,i);
            sum = -sum;

        }
        return sum;
    }

    static void printSum(double sum){
        System.out.println("FINAL SUM: "+sum);
    }
}
