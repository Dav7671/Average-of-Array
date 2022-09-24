import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The Average = " + sum / arr.length);
    }
}
