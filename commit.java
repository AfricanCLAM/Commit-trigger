import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10:");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println(number + " is an odd number.");
        } else if (number == 2) {
            System.out.println(number + " is an even number.");
        } else if (number == 3) {
            System.out.println(number + " is an odd number.");
        } else if (number == 4) {
            System.out.println(number + " is an even number.");
        } else if (number == 5) {
            System.out.println(number + " is an odd number.");
        } else if (number == 6) {
            System.out.println(number + " is an even number.");
        } else if (number == 7) {
            System.out.println(number + " is an odd number.");
        } else if (number == 8) {
            System.out.println(number + " is an even number.");
        } else if (number == 9) {
            System.out.println(number + " is an odd number.");
        } else if (number == 10) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println("The number is out of range.");
        }

        scanner.close();
    }
}
