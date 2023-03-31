//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->


import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ввод числа: ");
        int num1 = in.nextInt();

        System.out.print("Ввод знака: ");
        String operation = in.next();

        System.out.print("Ввод числа: ");
        int num2 = in.nextInt();

        in.close();

        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Неверное действие");
                break;
        }
    }
}
