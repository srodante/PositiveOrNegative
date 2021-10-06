import java.util.Scanner;

public class PosiitveorNegative {
    public static void main (String []args){
        Scanner keybd = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = keybd.nextInt();

        if (number < 0){
            System.out.println("The number entered is negative");
        } else if (number > 0){
            System.out.println("The number entered is positive");
        } else {
            System.out.println("The number zero is neither positive nor negative");
        }
    }
}
