public class labfour {

    public static void main(String[] args) {
        compareXtoY(3,2);
        System.out.println(getCharGradeFromInt(75));
        System.out.println(isIntOdd(21));
    }

    public static void compareXtoY(int x, int y) {
        if (x > y)
            System.out.println("X is greater than Y");
        if (x == y)
            System.out.println("X is equal to Y");
        if (x != y){
            System.out.println("X is not equal to  Y");
            x = y;
            System.out.println("However, now it is.");
        }    
    }

    public static char getCharGradeFromInt(int score) {
        if (score < 60) {
            return 'F';
        } else if (score < 70) {
            return 'D';
        } else if (score < 80) {
            return 'C';
        } else if (score < 90) {
            return 'B';
        } else if (score <= 100) {
            return 'A';
        } else {
            return 'X';
        }
    }

    public static boolean isIntOdd(int value) {
        if (value % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    
}