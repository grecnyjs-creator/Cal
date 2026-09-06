import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
//qdw
    public static void main(String[] args) {
        double num1;
        double num2;
        char sym = 0;
        double res=0;
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        num1 = scanner.nextDouble();
        System.out.println("Введите знак");
        sym = scanner.next().charAt(0);
         if (sym !='-' && sym !='+' && sym !='/' && sym !='*') {
             System.out.println("Введен неопределенный знак!");
             return;
         }
        System.out.println("Введите 2 число");
        num2 = scanner.nextDouble();
        switch (sym) {
            case '+':

                res = num1 + num2;
                break;
            case '-':

                res = num1 - num2;
                break;
            case '/':

                res = num1 / num2;
                if(num2 == 0) {
                    System.out.println("На ноль делить нельзя, дэут");
                    return;
                }
                else {
                break;}
            case '*':

                res = num1 * num2;
                break;
        }
            System.out.println("Результат: " + res);
        }catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число.");
        }
    }
}