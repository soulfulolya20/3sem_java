import java.util.Arrays;
import java.util.Random;

public class Sort {
    private long seed = 2;
    private Random random;

    public Sort() {
        random = new Random(seed);
    }

    public int[] generateArray() {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("Массив рандомных чисел:");
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));

        return arr;
    }

    public void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
}