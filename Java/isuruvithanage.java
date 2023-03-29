import java.util.Arrays;
import java.util.Scanner;

public class isuru {
    //BubbleSort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;

        //Validating the length
        do {
            System.out.println("ENTER A INTEGER NUMBER FOR LENGTH : ");
            n = sc.nextDouble();
        }while (!((n % 1) == 0));

        double[] arr = new double[(int)n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(double[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; ++j) {
                if (arr[j] < arr[j - 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

