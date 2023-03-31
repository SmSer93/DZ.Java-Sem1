//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//      Ввод:5
//    Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//  n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        sc.close();
        int summa = 0;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            summa = summa + i;
            factorial = factorial * i;
        }
        System.out.println(summa);
        System.out.println(factorial);

    }
}