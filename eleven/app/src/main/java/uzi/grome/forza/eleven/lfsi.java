package harry.keine.britan.gsdwe;

import java.util.Arrays;

public class lfsi {
    public static void arrayInitiaize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void arrayPrinting(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
    }
}
