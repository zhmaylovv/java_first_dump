package zhmaylo;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        double[] array = new double[input.nextInt()];
        System.out.print("Enter upper limit: ");
        double upperLimit = input.nextInt();
        System.out.print("Enter lower limit: ");
        double lowerLimit = input.nextInt();
        double min = upperLimit;
        double max = lowerLimit;

        for (int i = 0; i < array.length; i++ ){
            array[i] = lowerLimit +(Math.random() * upperLimit);
            if (array[i]> max){
                max = array[i];
            }else if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Maximum number in array is: " + max);
        System.out.println("Minimum number in array is: " + min);
        System.out.println("Average number in array is: " + calcAverage(array));
    }

    public static double calcAverage(double[] array){
        double sum = 0.0;

        for (double element : array) sum += element;
        return sum / array.length;

    }
}
