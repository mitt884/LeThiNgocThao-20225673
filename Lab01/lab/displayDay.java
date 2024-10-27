package Lab01.lab;

import java.util.Scanner;

public class displayDay {
    public static void main(String[] args) {
        String[] Day_31 = {
            "January", "Jan.", "Jan", "1",
            "March", "Mar.", "Mar", "3",
            "May", "5",
            "July", "Jul", "7",
            "August", "Aug.", "Aug", "8",
            "October", "Oct.", "Oct", "10",
            "December", "Dec.", "Dec", "12"
        };

        String[] Day_30 = {
            "April", "Apr.", "Apr", "4",
            "June", "Jun", "6",
            "September", "Sept.", "Sep", "9",
            "November", "Nov.", "Nov", "11"
        };

        String[] Day_28 = {
            "February", "Feb.", "Feb", "2"
        };

        // Using try-with-resources to ensure scanner is closed
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int year;
                while (true) {
                    System.out.println("Enter year: ");
                    year = scanner.nextInt();

                    if (year > 0) break;
                }

                System.out.println("Enter month: ");
                scanner.nextLine(); // Consume the newline
                String thang = scanner.nextLine();

                for (String s : Day_31) {
                    if (s.equals(thang)) {
                        System.out.println("Thang " + s + " Nam " + year 
                            + "\nSo ngay trong thang la: 31");
                        return; // Exit normally
                    }
                }

                for (String s : Day_30) {
                    if (s.equals(thang)) {
                        System.out.println("Thang " + s + " Nam " + year 
                            + "\nSo ngay trong thang la: 30");
                        return; // Exit normally
                    }
                }

                for (String s : Day_28) {
                    if (s.equals(thang)) {
                        if (year % 4 == 0 && year % 100 != 0) {
                            System.out.println("Month " + s + " Year " + year + "\n" +
                                               "So ngay trong thang la: 29");
                            return; // Exit normally
                        } else {
                            System.out.println("Month " + s + " Year " + year + "\n" + 
                                               "So ngay trong thang la: 28");
                            return; // Exit normally
                        }
                    }
                }
                System.out.println("\nInvalid!");
            }
        } // The scanner will be closed automatically here
    }
}
