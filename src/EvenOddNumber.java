import java.util.Scanner;


public class EvenOddNumber {
    static int number; //Global variable

    public static void main(String[] args) {
        System.out.println("Input any number to check whether it is odd or even: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt(); //scanner used to input data

        String input = (number % 2 == 0) ? "Even" : "Odd"; //turnery operator used
        System.out.println(input);

    }
}
