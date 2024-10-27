package Lab01.lab;

import java.util.Scanner;

public class FromKeyboard {
    public static void main(String[] args) {
        // Using try-with-resources to ensure the scanner is closed
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Le Thi Ngoc Thao 20225673. What's your name?");
            String name = keyboard.nextLine();
            System.out.println("How old are you?");
            int age = keyboard.nextInt();
            System.out.println("How tall are you?");
            double height = keyboard.nextDouble();

            System.out.println("Mr/Mrs. " + name + ", " + age + " years old."
                               + " Your height is " + height + ".");
        } // The scanner will be closed automatically here
    }
}
