package by.itacademy.laisha.foodproductseller.account;

import by.itacademy.laisha.foodproductseller.utils.*;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public final class AccountInitialization {

    private static final String USER_STEP_EXIT = "1-user_exit";
    private static final String AUTHORIZATION_ATTEMPTS_EXIT = "2-attempts_exit";
    private static final String USER_STEP_BACK = "back";
    private static final int AUTHORIZATION_ATTEMPTS_COUNTER = 3;
    private static final int LOGIN_MAXIMUM_LENGTH = 32;
    private static final int LOGIN_MINIMUM_LENGTH = 6;
    private static final int PASSWORD_MAXIMUM_LENGTH = 16;
    private static final int PASSWORD_MINIMUM_LENGTH = 8;
    private static String userAccountLogin;
    private static String userAccountPassword;
    private static int loginAttemptCounter;
    private static int passwordAttemptCounter;
    private static final Scanner scanner = new Scanner(System.in);
    private static final AccountDatabase accountDatabase = new AccountDatabase();

    public static boolean initializeAccount() {
        boolean authorization;
        accountDatabase.loadAccountsDatabase();
        authorization = authorizeUser();
        if (authorization) {
            ScreenUtils.printFramedString(AccountDatabase.account.getUserAccountName() +
                    ", you have successfully logged in system!");
        }
        return authorization;
    }

    private static boolean authorizeUser() {

        boolean AccountValidness = false;

        ScreenUtils.printFramedString("Welcome!");
        lbl:
        {
            do {
                checkUserAccountLoginValidness();
                switch (userAccountLogin) {
                    case USER_STEP_EXIT:
                        ScreenUtils.printFramedString("Good bye! Come back for more, please.");
                        break lbl;
                    case AUTHORIZATION_ATTEMPTS_EXIT:
                        ScreenUtils.printString("Good bye! Please try again in one hour.");
                        ScreenUtils.printStrip();
                        break lbl;
                }
                checkUserAccountPasswordValidness();
            } while (userAccountPassword.equals(USER_STEP_BACK));
            switch (userAccountPassword) {
                case USER_STEP_EXIT:
                    ScreenUtils.printFramedString("Good bye! Come back for more, please.");
                    break;
                case AUTHORIZATION_ATTEMPTS_EXIT:
                    ScreenUtils.printString("Good bye! Please try again in one hour.");
                    ScreenUtils.printStrip();
                    break;
                default:
                    AccountValidness = true;
            }
        }
        return AccountValidness;
    }

    private static void checkUserAccountLoginValidness() {

        do {
            loginAttemptCounter++;
            if (loginAttemptCounter == AUTHORIZATION_ATTEMPTS_COUNTER + 1) {
                userAccountLogin = AUTHORIZATION_ATTEMPTS_EXIT;
                ScreenUtils.printFramedString("The login you entered is missing.\n" +
                        "You have exceeded the maximum number of attempts.");
                break;
            }
            if (loginAttemptCounter != 1) {
                ScreenUtils.printFramedString("The login you entered is missing.\n" +
                        (AUTHORIZATION_ATTEMPTS_COUNTER - loginAttemptCounter + 1) + " attempt(s) left.");
            }
            getUserAccountLogin();
            if (userAccountLogin.equals(USER_STEP_EXIT)) {
                loginAttemptCounter--;
                break;
            }
        }
        while (!(AccountDatabase.checkUserAccountLoginValidness(userAccountLogin)));
        if (!(userAccountLogin.equals(USER_STEP_EXIT) || userAccountLogin.equals(AUTHORIZATION_ATTEMPTS_EXIT))) {
            ScreenUtils.printFramedString("The login has been accepted.");
            loginAttemptCounter--;
        }
    }

    private static void getUserAccountLogin() {

        try {
            do {
                ScreenUtils.printString("Enter your login, please: (for example - \"ivanov\")\n" +
                        "(for exit enter 1)");
                userAccountLogin = scanner.nextLine();
                if (userAccountLogin.equals("1")) {
                    userAccountLogin = USER_STEP_EXIT;
                    break;
                }
                if (userAccountLogin.length() >= LOGIN_MINIMUM_LENGTH &&
                        userAccountLogin.length() <= LOGIN_MAXIMUM_LENGTH) {
                    if (Pattern.matches("^[A-Za-z][^\\W_]*_?[^\\W_]*$", userAccountLogin)) {
                        break;
                    } else {
                        ScreenUtils.printFramedString("Allowed to use lowercase and uppercase letters,\n" +
                                "arabic numbers (not first) or underscore\n" +
                                "(no more than once and not first).");
                    }
                } else {
                    ScreenUtils.printFramedString("Allowed to use one token consisting of\nminimum "
                            + LOGIN_MINIMUM_LENGTH + " and maximum " + LOGIN_MAXIMUM_LENGTH + " characters.");
                }
            }
            while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("Login string has not been found");
            Logger.log("Login string has been read failed.");
        }
    }

    private static void checkUserAccountPasswordValidness() {

        do {
            passwordAttemptCounter++;
            if (passwordAttemptCounter == AUTHORIZATION_ATTEMPTS_COUNTER + 1) {
                userAccountPassword = AUTHORIZATION_ATTEMPTS_EXIT;
                ScreenUtils.printFramedString("The password you entered is missing.\n" +
                        "You have exceeded the maximum number of attempts.");
                break;
            }
            if (passwordAttemptCounter != 1) {
                ScreenUtils.printFramedString("The password you entered is missing.\n " +
                        (AUTHORIZATION_ATTEMPTS_COUNTER - passwordAttemptCounter + 1) + " attempt(s) left.");
            }
            getUserAccountPassword();
            if (userAccountPassword.equals("1")) {
                userAccountPassword = USER_STEP_EXIT;
                break;
            } else if (userAccountPassword.equals("2")) {
                userAccountPassword = USER_STEP_BACK;
                break;
            }
        }
        while (!(accountDatabase.checkUserAccountPasswordValidness(userAccountLogin, userAccountPassword)));
        if (!(userAccountPassword.equals(USER_STEP_EXIT) || userAccountPassword.equals(USER_STEP_BACK) ||
                userAccountPassword.equals(AUTHORIZATION_ATTEMPTS_EXIT))) {
            ScreenUtils.printStrip();
            ScreenUtils.printString("The password has been accepted.");
        }
    }

    private static void getUserAccountPassword() {

        try {
            do {
                ScreenUtils.printString("Enter your password, please: (for example - \"11111QQqq)\")\n" +
                        "(for exit enter 1, back - 2)");
                userAccountPassword = scanner.nextLine();
                if (userAccountPassword.equals("1") || userAccountPassword.equals("2")) {
                    break;
                }
                if (userAccountPassword.length() >= PASSWORD_MINIMUM_LENGTH &&
                        userAccountPassword.length() <= PASSWORD_MAXIMUM_LENGTH) {
                    if (Pattern.matches(".*\\d+.*", userAccountPassword) && //TODO  optimaize (regex)
                            Pattern.matches(".*\\p{Upper}+.*", userAccountPassword) &&
                            Pattern.matches(".*\\p{Lower}+.*", userAccountPassword) &&
                            Pattern.matches(".*\\p{Punct}*.*", userAccountPassword)) {
                        break;
                    } else {
                        ScreenUtils.printFramedString("Allowed to use lowercase (at least once) and uppercase\n" +
                                "(at least once) letters, arabic numbers (at least once) and symbols\n" +
                                "\"~ ! ? @ # $ % ^ & * _ - + ( ) [ ] { } > < / \\ | \" ' . , : ;\" (optional).");
                    }
                } else {
                    ScreenUtils.printFramedString("Allowed to use one token consisting of\n" +
                            "minimum " + PASSWORD_MINIMUM_LENGTH +
                            " and maximum " + PASSWORD_MAXIMUM_LENGTH + " characters.");
                }
            }
            while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("Password string has not been found");
            Logger.log("Password string has been read failed.");
        }
    }
}

