public class CharacterCheck {

    public static void charDecider(char input){
        if ((input>=65 && input<=90) || (input>=97 && input<=122))
            System.out.println("Alphabet");
        else if (input>=48 && input<=57)
            System.out.println("Digit");
        else
            System.out.println("Special Character");
            
        }

    public static void main(String[] args) {
//        char input = '$';
        charDecider('*');
    }
}

