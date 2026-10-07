package arrays;
import java.util.Arrays;

public class ReverseOfArray {

    private void Swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

    private int[] ReverseOfArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            Swap(arr, i, j);
            i++;
            j--;

        }
        return arr;
    }

    public void solve() {

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{1, 2, 3, 4, 5})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{10, 20, 30, 40})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{1})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{5, 4, 3, 2, 1})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{10, 10, 20, 20})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{-1, -2, -3, -4})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{100, 200})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{7, 8, 9})
        ));

        System.out.println(Arrays.toString(
                ReverseOfArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8})
        ));
    }

}
