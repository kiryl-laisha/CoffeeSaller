package by.itacademy.laisha.coffeesaller.account;

import by.itacademy.laisha.coffeesaller.screen.Screen;

import java.util.Scanner;

public class Account {
    private String accountLogin;
    private String accountPassword;

    Screen screen = new Screen();
    Scanner scanner = new Scanner(System.in);
    AccountDatabase accountdb = new AccountDatabase();
    boolean authorization;

    public Account() {
        if (!authorization) {
            screen.printScreen("Welcome!");
            screen.printScreen("Enter your login, please! (troshkin)");
            accountLogin = scanner.nextLine();
            screen.printScreen("Enter your password, please! (1234)");
            accountPassword = scanner.nextLine();

            authorization = accountdb.getAuthorization(accountLogin, accountPassword);
            if (authorization) {
                screen.printScreen("Enter in system had completed.");
                screen.printScreen("Welcome, " + accountdb.getUserName() + "!");
            } else {
                screen.printScreen("Invalid login or password. Please, try again.");
            }
        }

    }

    public int getAuthorisedUserAccessParameter() {
         return accountdb.getUserAccessParameter();
    }
}
