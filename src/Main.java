import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String input = scanner.next().toLowerCase().trim();

        if (input.matches("[a-z]")) {
            System.out.println("латиница");
        } else if (input.matches("[а-я]")) {
            System.out.println("кирилица");
        } else if (input.matches("[0-9]")) {
            System.out.println("цифра");
        } else {
            System.out.println("невозможно определить");
        }
    }
}