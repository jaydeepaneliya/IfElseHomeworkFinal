import java.util.Scanner;

public class SelectSymbolAndDoMath {
    static int num1, num2;

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        Scanner scanner1 = new Scanner(System.in);
        num2 = scanner1.nextInt();

        char symbol = '*';
        switch(symbol){
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
