import java.util.Scanner;

public class AssignmentFour {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char inputChar = getInputCharFromUser();
        String value = getValueFromChar(inputChar);
        System.out.println(value);
        System.out.println(isPass(69));
        System.out.println(isPass(99));
        printPay(17.50, 5);

        scanner.close();
    }

    public static char getInputCharFromUser() {
        final String CHAR_PROMPT = "Enter input char: ";
        System.out.println(CHAR_PROMPT);
        char inputChar = scanner.nextLine().charAt(0);
        return inputChar;
    }

    public static String getValueFromChar(char inputChar) {
        String value;
        switch (inputChar)
        {
            case 'P':
            case 'p':
            value = "Player";
            break;
            case 'X':
            case 'x':
            value = "Wall";
            break;
            case ' ':
            value = "Empty";
            break;
            default: 
            value = "Invalid";
            break;
        }
        return value;
    }

    public static boolean isPass(int grade) {
        return grade >= 70 ? true : false;
    }

    public static void printPay(double wage, int hours){
        
        System.out.printf("%.2f x %d = %.2f", wage, hours, wage*hours);
    }
}