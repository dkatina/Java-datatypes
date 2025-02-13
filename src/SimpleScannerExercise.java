import java.util.Scanner;

public class SimpleScannerExercise {
    public static void main(String[] args) {
        //creating a scanner for keyboard input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your input: ");
        String name = scanner.nextLine(); //Reads a line of text

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.println("your name: " + name);
        System.out.println("your age: " + age);
    }
}
