
import java.util.Scanner;

public class Task7 {

    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число от 0 до 20: ");
        int number = sc.nextInt();

        if (number < 0 || number > 20) {
            System.out.println("Введите число от 0 до 20!");
        } else {
            long result = factorial(number);
            System.out.println("Факториал числа " + number + " = " + result);
        }

        sc.close();
    }
}
