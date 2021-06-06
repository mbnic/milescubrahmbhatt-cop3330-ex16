package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static int legalAge = 16;

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.getAge();
        String output = myApp.generateOutput(age);
        myApp.printOutput(output);
    }

    public void printOutput(String output) {
        System.out.println(output);
    }

    public String generateOutput(int age) {
        String output = (age >= legalAge) ? (String.format("You are old enough to legally drive."))
                : (String.format("You are not old enough to legally drive."));

        return output;
    }

    public int getAge() {
        System.out.printf("What is your age? ");
        return Integer.parseInt(in.nextLine());
    }
}
