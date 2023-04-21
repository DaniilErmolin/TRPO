import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        BubbleSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static int[] BubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped = true;
        int i = 0;
        while(i < n - 1 && isSwapped){
            isSwapped = false;
            int j = 0;
            while (j < n -i -1){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
                j++;
            }
            i++;
        }
        return arr;
    }
}