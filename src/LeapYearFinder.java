import java.util.Scanner;

public class LeapYearFinder {
    static int year;

    public static void main(String args[]) {
        System.out.println("Input any year to check leap year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap year!!!");
        } else {
            System.out.println("Not a leap year!");
        }
    }
}
