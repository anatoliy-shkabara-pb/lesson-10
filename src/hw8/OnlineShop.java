package hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Auth auth = new Auth();

        while (true) {
            System.out.println();
            System.out.println("Hello in OnlineShop");
            System.out.println("1. Sign up as new user");
            System.out.println("2. Sign in");
            System.out.println("3. Exit");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    signUp(scan, auth);
                    break;
                case "2":
                    signIn(scan, auth);
                    break;
                case "3":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Wrong menu number!");
            }
        }
    }

    private static void signUp(Scanner scan, Auth auth) {
        System.out.println("Input login: ");
        String login = scan.nextLine();

        System.out.println("Input password: ");
        String password = scan.nextLine();

        System.out.println("Confirm password: ");
        String confirmPassword = scan.nextLine();

        try {
            auth.signUp(login, password, confirmPassword);
            System.out.println("New user registered successful!");
        } catch (WrongLoginException ex) {
            System.out.println("Login error: " + ex.getMessage());
        } catch (WrongPasswordException ex) {
            System.out.println("Password error: " + ex.getMessage());
        }
    }

    private static void signIn(Scanner scan, Auth auth) {
        System.out.println("Input login: ");
        String login = scan.nextLine();

        System.out.println("Input password: ");
        String password = scan.nextLine();

        try {
            auth.signIn(login, password);
            System.out.println("Hello " + login + ", sing in successful!");
        } catch (WrongLoginException ex) {
            System.out.println("Sig in error: " + ex.getMessage());
        }
    }
}
