import java.util.Arrays;
import java.util.Random;

public class Csoft {
    public static void main(String[] args) {
        // int arr[] = { -535000000, 0, -372, -299,830000};
        // int arr[] = {100, 93, 97, 92, 96, 99, 92, 89, 93, 97, 90, 94, 0, -1,-1,-95};
        // int arr[] = Random_Numbers(500000000);
        int arr[] = Random_Numbers(20);
        System.out.println(Arrays.toString(arr));
        new Csoft(arr);
        System.out.println(Arrays.toString(arr));
    }

    private int min;

    Csoft() {
    }

    Csoft(int[] arr) {
        b(arr);
    }

    public static int[] b(int[] arr) {
        int max = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > arr[max] ? i : max;
            min = arr[i] < arr[min] ? i : min;
        }
        int k = -arr[min]; // k=基數
        max = arr[max] + 1;
        int[] a = new int[max + k];
        for (int i = 0; i < arr.length; i++) {
            int o = arr[i] + k;
            a[o]++;
        }
        int t = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > 0) {
                for (int i = 0; i < a[j]; i++) {
                    arr[t] = j - k;
                    t++;
                }
            }
        }
        return arr;
    }

    public static int[] Random_Numbers(int num) { // 亂數負數
        Random r = new Random();
        int[] c = new int[num];
        for (int i = 0; i < num; i++) {
            c[i] = r.nextInt(1000) - 500;
        }
        return c;
    }
}