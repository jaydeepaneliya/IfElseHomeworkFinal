import java.util.Scanner;

public class PositiveNegativeZero {
    static int num;

    public static void main(String[] args) {
        System.out.println("Enter any number here: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num > 0){
            System.out.println("Posotive Number");
        }
        else if (num < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
