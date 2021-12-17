package by.itacademy.laisha.coffeesaller.account;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.itacademy.laisha.coffeesaller.utils.ScreenUtils;

public final class AccountInitialization {

    private static final AccountDatabase accountdb = new AccountDatabase();
    private static final ScreenUtils screenUtil = new ScreenUtils();
    private static final Scanner scanner = new Scanner(System.in);
    // public static Map<Integer, AbstractService> services = new HashMap<>();
    public static StringBuffer inputFolder = new StringBuffer();
    public static StringBuffer outputFolder = new StringBuffer();

    public static void initializeAccount() {
        AccountDatabase.loadAccountDataBase();
        String accountLogin;
        String accountPassword;

        while (true) {
            try {
                System.out.println("Welcome!");
                System.out.println("Enter your login, please:");
                lbl:
                do {
                    accountLogin = scanner.nextLine();
                    if (accountLogin.length() < 32) {
                        if (Pattern.matches("(\\p{Upper}|\\p{Lower})\\w{5,30}", accountLogin)) {
                            Pattern underscore = Pattern.compile("_");
                            Matcher matcher = underscore.matcher(accountLogin);
                            int underscoreCounter = 0;
                            while (matcher.find()) {
                                underscoreCounter++;
                                if (underscoreCounter > 1) {
                                    System.out.println("\"_\" can be used no more than once.\n" +
                                            "Please, enter your login correctly:");
                                    continue lbl;
                                }
                            }
                            System.out.println("Login has accepted.");
                            break lbl;
                        } else {
                            System.out.println("Allowed to use minimum six letters, numbers (not first) or " +
                                    "\"_\" (no more than once and not first).\n" +
                                    "Please, enter your login correctly:");
                            continue lbl;
                        }
                    } else {
                        System.out.println("Аvailable for use no more than 32 characters.\n" +
                                "Please, enter your login correctly:");
                    }
                }
                while (true);
                checkAccount(accountLogin);


                screenUtil.printString("Enter your password, please! (1234)");
                accountPassword = scanner.nextLine();
                // }


                // authorization = accountdb.getAuthorization(accountLogin, accountPassword);
                // if (authorization) {
                //      screenUtil.printString("Enter in system had completed.");
                //      screenUtil.printString("Welcome, " + accountdb.getUserName() + "!");
                //  } else {
                //       screenUtil.printString("Invalid login or password. Please, try again.");
                //   }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }

    private static void checkAccount(String accountLogin) {
        AccountDatabase.checkAccount(accountLogin);
    }

    public static int getAuthorisedUserAccessParameter() {
        return accountdb.getUserAccessParameter();
    }


    public static void initialisation() {
        // Папка, где хранятся входные файлы


        // Папка, где хранятся выходные файлы
        outputFolder.append("src").append(File.separator).append("by").append(File.separator).append("itacademy")
                .append(File.separator).append("laisha").append(File.separator).append("coffeesaller").append(File.separator)
                .append("files").append(File.separator).append("output").append(File.separator);

        File file;

        // Набор отелей
        // file = new File(inputFolder.toString() + "hotels.txt");
        // Set<Hotel> hotels = createHotels(file);


    }
}
