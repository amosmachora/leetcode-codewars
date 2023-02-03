import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner myuser = new Scanner(System.in);

        System.out.println("Enter your username: ");

        String username = myuser.nextLine();

        try {
            int valueInInteger = Integer.parseInt(username);
            System.out.println("Incorrect username! ");
        } catch (NumberFormatException e) {
            System.out.println("Your username is: " + username);
        }

        System.out.println("Enter your pin code: ");
        int pin = myuser.nextInt();
        System.out.println("Your pin code is: " + pin);
    }
}
