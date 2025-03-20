import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class BonusLoops {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public static void main(String[] args) {
        calculateSum();
        calculateUntil1000();
        checkListForNumber();
        sumOfArray();
        printStringArray();
        printPrimeNumbers();
        printIntLargerThan(45);
        countdown();
        fibonacci();
        printTriangle(10);
    }

    //  Bonus 1: Calculate sum of all numbers from 1 to 100
    private static void calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum of all numbers from 1 to 100 is: " + sum);
    }

    //  Bonus 2: Print numbers until sum of all numbers is more than 1000
    private static void calculateUntil1000() {
        int result = 1;
        while (result <= 1000) {
            System.out.println(result);
            result = result * 2;
        }
    }

    //  Bonus 3: Check list for number 45
    private static void checkListForNumber() {
        int[] numbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};

        int target = 45;

        ArrayList<Integer> foundTargetAt = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundTargetAt.add(i);
            }
        }

        if (!foundTargetAt.isEmpty()) {
            System.out.println("Number " + target + " was found at index: " + foundTargetAt);
        } else {
            System.out.println("Number " + target + " was not found in the array.");
        }
    }

    //  Bonus 4: Calculate sum of array of integers
    private static void sumOfArray() {
        int[] arrayOfIntegers = {12, 5, 7, 2, 18, 3, 9, 12};
        int sum = 0;
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            sum += arrayOfIntegers[i];
        }
        System.out.println("The sum of the integer array is: " + sum);
    }
    //  Bonus 5: print list of strings until you find an empty string in the array
    private static void printStringArray() {
        int i = 0;
        String[] listOfStrings = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        while (!listOfStrings[i].equals("")) {
            System.out.print(listOfStrings[i] + " ");
            i++;
        }
    }

    //  Bonus 6: Print all prime numbers
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static void printPrimeNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    //  Bonus 7: Print all items > 45
    private static void printIntLargerThan(int target) {
        int[] arrayOfNumbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > target) {
                System.out.println(arrayOfNumbers[i]);
            }
        }
    }

    //  Bonus 8: Countdown 10-0
    private static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Go!");
    }

    //  Bonus 9: Generate first 10 Fibonacci numbers
    private static void fibonacci() {
        int count = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

    //  Bonus 10: print asterisk triangle
    private static void printTriangle(int amountOfRows) {
        int rows = amountOfRows; // number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces: (rows - i) spaces for the current row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks: (2 * i - 1) stars for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
