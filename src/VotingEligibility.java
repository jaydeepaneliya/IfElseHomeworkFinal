import java.util.Scanner;

public class VotingEligibility {
    static int age;

    public static void main(String[] args) {
        System.out.println("Enter your age here: ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age>=18){
            System.out.println("Person is eligible to vote!");
        } else {
            System.out.println("Person is NOT eligible to vote!!");
        }
    }
}
