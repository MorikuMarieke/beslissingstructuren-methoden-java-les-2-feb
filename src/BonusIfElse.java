import java.util.Locale;
import java.util.Scanner;

public class BonusIfElse {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public static void main(String[] args) {
        evenOddChecker();
        grader();
        highestNumber();
        positiveNegativeOrZeroChecker();
        ageChecker();
        textLengthChecker();
        wordCount();
        leapYearChecker();
        largestOfThreeNumbers(190, 190, 38);
        triangleShape(9, 2, 4);
        simpleCalculator();
    }

    // Bonus opdrachten:
    //    opdracht 1 Even odd checker
    private static void evenOddChecker() {
        System.out.print("Enter a number: ");
        int inputNumberOddOrEven = scanner.nextInt();
        if (inputNumberOddOrEven % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }
    }

    //    opdracht 2 grader
    private static void grader() {
        System.out.print("Enter a number, and we'll say what grade you got!: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Dude, that's not a valid number!");
            scanner.next(); // Clear the invalid input
            return; // Exit the function early
        }
        double numericalGrade = scanner.nextDouble();
        if (numericalGrade < 0 || numericalGrade > 10) {
            System.out.println("Dude, enter a number between 0 an 10...");
        } else if (numericalGrade <= 4) {
            System.out.println(numericalGrade + " equals F");
        } else if (numericalGrade <= 5) {
            System.out.println(numericalGrade + " equals E");
        } else if (numericalGrade <= 6) {
            System.out.println(numericalGrade + " equals D");
        } else if (numericalGrade <= 7) {
            System.out.println(numericalGrade + " equals C");
        } else if (numericalGrade <= 8) {
            System.out.println(numericalGrade + " equals B");
        } else if (numericalGrade <= 9) {
            System.out.println(numericalGrade + " equals A");
        } else {
            System.out.println(numericalGrade + "equals A+");
        }
    }

    //    opdracht 3 grootste van twee getallen
    private static void highestNumber() {
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("The highest number is " + num1);
        } else {
            System.out.println("The highest number is " + num2);
        }
    }

    //    opdracht 4 positief/negatief/zero checker
    private static void positiveNegativeOrZeroChecker() {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is zero!");
        }
    }

    //    opdracht 5 leeftijdsclassificatie
    private static void ageChecker() {
        System.out.println("Voer een leeftijd in: ");
        int age = scanner.nextInt();
        if (age < 12) {
            System.out.println("Iemand met de leeftijd " + age + " is een kind.");
        } else if (age < 18) {
            System.out.println("Iemand met de leeftijd " + age + " is een puber.");
        } else if (age < 65) {
            System.out.println("Iemand met de leeftijd " + age + " is een volwassene.");
        } else {
            System.out.println("Iemand met de leeftijd " + age + " is een senior.");
        }
    }

    //    opdracht 6 tekstlengte checker
    private static void textLengthChecker() {
        System.out.println("Type een tekst in: ");
        String text = scanner.nextLine();
        int charCount = text.trim().length();
//        int amountOfWords =
        if (text.trim().length() < 10) {
            System.out.println("Deze tekst is kort.");
        } else if (text.trim().length() < 20) {
            System.out.println("Deze tekst is middellang.");
        } else {
            System.out.println("Deze tekst is lang.");
        }
    }

    private static void wordCount() {
        System.out.println("Typ een zin in: ");
        String string = scanner.nextLine();
        int wordCount = 0;
        if (string.isEmpty()) {
            System.out.println("Je hebt niks ingetypt.");
        } else {
            String[] words = string.trim().split("\\s+");
            wordCount = words.length;
            System.out.println("Deze zin heeft " + wordCount + " woorden.");
        }
    }

    //    opdracht 7 jaarchecker
    private static void leapYearChecker() {
        System.out.println("Typ een jaartal in: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            System.out.println(year + " is een schrikkeljaar.");
        } else {
            System.out.println(year + " is geen schrikkeljaar.");
        }
    }

    //    opdracht 8 grootste van 3 getallen
    private static void largestOfThreeNumbers(int num1, int num2, int num3) {
        if (num1 >= num3 && num1 >= num2) {
            System.out.println(num1 + " is largest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest.");
        } else {
            System.out.println(num3 + " is largest.");
        }
    }

    //    opdracht 9 driehoekstype
    private static void triangleShape(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Deze zijden vormen geen geldige driehoek.");
            return;
        }
        if (side1 == side2 && side2 == side3) {
            System.out.println("Deze driehoek is gelijkzijdig");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Deze driehoek is gelijkbenig.");
        } else {
            System.out.println("Deze driehoek is ongelijkzijdig");
        }
    }

    //    opdracht 10 calculator
    private static void simpleCalculator() {
        System.out.println("Available operators: *, /, -, +, %. Enter a calculation like: 4 * 3 and press 'Enter':");
        double num1 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("= " + (num1 + num2));
                break;
            case '-':
                System.out.println("= " + (num1 - num2));
                break;
            case '*':
                System.out.println("= " + (num1 * num2));
                break;
            case '/':
                System.out.println("= " + (num1 / num2));
                break;
            case '%':
                System.out.println("= " + (num1 % num2));
                break;
            default:
                System.out.println("This is a simple calculator bruv.");
        }
    }
}
