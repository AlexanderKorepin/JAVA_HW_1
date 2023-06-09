import java.util.Scanner;
// Реализовать простой калькулятор
public class zadacha_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.printf("Введите первое число: ");
        double number_1 = sc.nextDouble();
        System.out.printf("Введите второе число: ");
        double number_2 = sc.nextDouble();
        System.out.printf("Введите необходимое3 действие(+ - / *): ");
        String operator = sc.next();
        double result;
        switch (operator) {
            case "+":
                result = number_1 + number_2;
                break;
            case "-":
                result = number_1 - number_2;
                break;
            case "*":
                result = number_1 * number_2;
                break;
            case "/":
                result = number_1 / number_2;
                break;
            default:
                System.out.println("Ошибка!");
                return;
        }
        System.out.printf("Результат: " + result);
    }
}