package by.itacademy.laisha.coffeesaller.account;

import by.itacademy.laisha.coffeesaller.utils.Logger;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class AccountDatabase {
    private static boolean authorization;
    private static int accountId = -1;
    private static int userAccessParameter;
    private static TreeMap<String, Account> accounts = new TreeMap<>();

    public AccountDatabase() {
    }

    public static void checkAccount(String accountLogin) {
    }

    public static void loadAccountDataBase() {
        try {
            Account asd1 = new Account();
            asd1.loadAccountsDataBase();
        } catch (Exception exception) {
            Logger.log("The account database has loaded incorrectly.");
        }
    }

    public boolean getAuthorization(String accountLogin, String accountPassword) {//TODO check by collection
        if (accountLogin.equals("troshkin") && accountPassword.equals("1234")) {
            authorization = true;
            this.accountId = 0;
            userAccessParameter = 1;
        } else if (accountLogin.equals("q") && (accountPassword.equals("1"))) {
            authorization = true;
            this.accountId = 1;
            userAccessParameter = 1;
        }
        return authorization;
    }

    public String getUserName() {//TODO check by collection
        String userName;
        switch (this.accountId) {
            case 0:
                userName = "Andrey";
                break;
            case 1:
                userName = "Kiryl";
                break;
            default:
                userName = "Invalid name";
        }
        return userName;
    }

    public int getUserAccessParameter() {
        return userAccessParameter;
    }

    private static final class Account {

        private String accountUserLogin;
        private String accountUserPassword;
        private String accountUserID;
        private String accountUserName;
        private String accountUserSurname;
        private static final String ACCOUNT_DATABASE_INPUT_FILE_NAME = "src\\by\\itacademy\\laisha\\coffeesaller" +
                "\\files\\input\\accounts.txt";


        public Account() {
        }

        public Account(String accountUserLogin, String accountUserPassword, String accountUserID, String accountUserName,
                       String accountUserSurname) {
            this.accountUserLogin = accountUserLogin;
            this.accountUserPassword = accountUserPassword;
            this.accountUserID = accountUserID;
            this.accountUserName = accountUserName;
            this.accountUserSurname = accountUserSurname;
        }

        public String getAccountLogin() {
            return accountUserLogin;
        }

        public void setAccountLogin(String accountUserLogin) {
            this.accountUserLogin = accountUserLogin;
        }

        /**
         * @param accountUserPassword    current account user's password
         * @param newAccountUserPassword new account user's password
         * @return true, if the account password was entered correctly and the new password differs from the old one,
         * false - in another case
         */
        public boolean setAccountUserPassword(String accountUserPassword, String newAccountUserPassword) {
            if (accountUserPassword.equals(this.accountUserPassword) &&
                    !accountUserPassword.equals(newAccountUserPassword)) {
                this.accountUserPassword = newAccountUserPassword;
                return true;
            } else {
                return false;
            }
        }

        public String getAccountUserID() {
            return accountUserID;
        }

        public void setAccountUserID(String accountUserID) {
            this.accountUserID = accountUserID;
        }

        public String getAccountUserName() {
            return accountUserName;
        }

        public void setAccountUserName(String accountUserName) {
            this.accountUserName = accountUserName;
        }

        public String getAccountUserSurname() {
            return accountUserSurname;
        }

        public void setAccountUserSurname(String accountUserSurname) {
            this.accountUserSurname = accountUserSurname;
        }

        void loadAccountsDataBase() throws Exception{
            Scanner scanner = null;
            try {
                scanner = new Scanner(new BufferedReader(new FileReader(ACCOUNT_DATABASE_INPUT_FILE_NAME)));
                while (scanner.hasNextLine()) {
                    accountUserLogin = scanner.next();
                    accounts.put(accountUserLogin, new Account(accountUserLogin, scanner.next(), scanner.next(),
                            scanner.next(), scanner.next()));
                }
            } catch (FileNotFoundException fileNotFoundException) {
                Logger.log("The named file was not found or for some other reason could not be opened for reading.");
            } catch (NullPointerException nullPointerException) {
                Logger.log("The named file is empty.");
            } catch (NoSuchElementException noSuchElementException) {
                Logger.log("The named file does not contain the required amount of information.");
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
    }
}


