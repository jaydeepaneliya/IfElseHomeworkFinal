import java.util.Scanner;

public class VowelConsonant {
    static char alphabet;

    public static void main(String[] args) {

        alphabet = 'p';

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            System.out.println(alphabet + " letter is Consonant");
        } else {
            System.out.println(alphabet + " letter is Vowel");
        }
    }

}
