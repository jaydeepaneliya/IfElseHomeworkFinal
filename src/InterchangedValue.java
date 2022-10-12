import java.util.Scanner;

public class InterchangedValue {
    static int a;
    static int b;
    static int c;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value of a: ");
        a = scanner.nextInt();

        System.out.println("Input value of b: ");
        b = scanner.nextInt();

        c=a;
        a=b;
        b=c;

        System.out.println("Now value of a is: "+ a + " and value of b is: "+b);


    }
}
