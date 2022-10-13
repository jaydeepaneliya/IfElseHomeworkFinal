import java.util.Scanner;

public class VowelConsonant {
    static char alphabet;

    public static void main(String[] args) {

        alphabet = 'a';

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            System.out.println("Consonant");
        } else {
            System.out.println("Vowel");
        }
    }

}
