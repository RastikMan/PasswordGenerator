package passwordGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GeneratePasswordByLength passwordGenerator = new GeneratePasswordByLength();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ГЕНЕРАТОР ПАРОЛІВ v1");

        System.out.println("Ведіть довжину пароля для генарації: ");
        int passwordLength = scanner.nextInt();
        System.out.println("Використовувати символи верхнього регістру?(true/false)");
        boolean includeUppercase = scanner.nextBoolean();
        System.out.println("Використовувати цифри?(true/false)");
        boolean includeDigits = scanner.nextBoolean();
        System.out.println("Використовувати спеціальні символи?(true/false)");
        boolean includeSpecialCharacters = scanner.nextBoolean();
        System.out.println("Якщо результат не задовльняє потреби, спробуйте ще раз!");

        System.out.println(passwordGenerator.generatePassword(passwordLength, includeUppercase, includeDigits, includeSpecialCharacters));
    }
}