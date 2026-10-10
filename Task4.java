
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Количество должно быть больше нуля");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int sumWhile = 0;
        int i = 0;

        while (i < n) {
            sumWhile += numbers[i];
            i++;
        }

        int sumDoWhile = 0;
        i = 0;

        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < n);

        int min = numbers[0];
        int max = numbers[0];

        for (i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        sc.close();
    }
}
