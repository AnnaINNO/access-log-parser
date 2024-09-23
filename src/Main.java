import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int summ = firstNumber+secondNumber;
        int diff = firstNumber-secondNumber;
        int mult = firstNumber*secondNumber;

        double quotient = (double) firstNumber / secondNumber;

        System.out.println(summ);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(quotient);

    }
}
