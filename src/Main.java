import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public static void main(String[] args) {
        hello();
        positiveOrNegative();
        bartender();
        sum();
    }


    // Basis opdrachten
    private static void hello() {
        System.out.println("Hello World");
    }

    private static void positiveOrNegative() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number < 0) {
            System.out.println("This number is negative");
        } else if (number > 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("Zero is neither positive nor negative.");
        }
    }

    private static void bartender() {
        System.out.println("Voer een naam in: ");
        String name = scanner.nextLine().trim();
        String formattedName = capitalizeFullName(name);

        switch (formattedName) {
            case "Bob":
                System.out.println(formattedName + " likes to drink Coffee");
                break;
            case "Robert-Jan":
                System.out.println(formattedName + " likes to drink Tea");
                break;
            case "Nova":
                System.out.println(formattedName + " likes to drink Water");
                break;
            case "Marieke":
                System.out.println(name + " likes to drink Spa rood");
                break;
            default:
                System.out.println("Onbekend");
        }
    }

    private static String capitalizeFullName(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }

        String[] parts = name.split("-");

        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();
            }
        }
        return String.join("-", parts);
    }

    private static void sum() {
        System.out.print("[ Enter a number: ] ___ ");
        int num1 = scanner.nextInt();
        System.out.print("[ Enter another number: ] ___ ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

}
