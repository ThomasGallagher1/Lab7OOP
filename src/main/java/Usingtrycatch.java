import java.util.Scanner;

public class Usingtrycatch {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please enter a number between 0 - 9 :");
                String input = myscan.nextLine();
                int myNum = Integer.parseInt(input);
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    break;
                } else {
                    System.out.println("Invalid number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
