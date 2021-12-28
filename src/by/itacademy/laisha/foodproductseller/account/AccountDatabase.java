package by.itacademy.laisha.foodproductseller.account;

import by.itacademy.laisha.foodproductseller.utils.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;

public class AccountDatabase {

    private static final String ACCOUNTS_DATABASE_INPUT_FILE_NAME = "src\\by\\itacademy\\laisha\\foodproductseller" +
            "\\files\\input\\accounts.txt";
    private static TreeMap<String, Account> accounts = new TreeMap<>();
    public static Account account;

    public void loadAccountsDatabase() {

        Logger.log("Entered the method AccountDatabase.loadAccountsDatabase();");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ACCOUNTS_DATABASE_INPUT_FILE_NAME)));
            while (scanner.hasNextLine()) {
                Account account = new Account(scanner.next(), scanner.next(), scanner.next(),
                        scanner.next(), scanner.next());
                accounts.put(account.getUserAccountLogin(), account);
            }
            Logger.log("The account database has been loaded.");
        } catch (FileNotFoundException fileNotFoundException) {
            Logger.log("The named file was not found or for some other reason could not be opened for reading.");
        } catch (NullPointerException nullPointerException) {
            Logger.log("The named file is empty.");
        } catch (NoSuchElementException noSuchElementException) {
            Logger.log("The named file does not contain the required amount of information.");
        } catch (Exception exception) {
            Logger.log("The account database has been loaded incorrectly.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        Logger.log("Exited the method AccountDatabase.loadAccountsDatabase();");
    }

    public static boolean checkUserAccountLoginValidness(String userAccountLogin) {

        Logger.log("Entered the method AccountDatabase.checkUserAccountLoginValidness(), without log \"Exited\";");
        return accounts.containsKey(userAccountLogin);
    }

    public boolean checkUserAccountPasswordValidness(String accountUserLogin, String accountUserPassword) {

        boolean resultOfCheckAccountPasswordValidness = false;

        Logger.log("Entered the method AccountDatabase.checkUserAccountPasswordValidness();");
        account = accounts.get(accountUserLogin);
        if (accountUserPassword.equals(account.getUserAccountPassword())) {
            resultOfCheckAccountPasswordValidness = true;
        }
        Logger.log("Exited the method AccountDatabase.checkUserAccountPasswordValidness();");
        return resultOfCheckAccountPasswordValidness;
    }

    // inner class
    public class Account {

        private String accountUserLogin;
        private String accountUserPassword;
        private String accountUserID;
        private String accountUserName;
        private String accountUserSurname;

        Account(String accountUserLogin, String accountUserPassword, String accountUserID, String accountUserName,
                String accountUserSurname) {
            this.accountUserLogin = accountUserLogin;
            this.accountUserPassword = accountUserPassword;
            this.accountUserID = accountUserID;
            this.accountUserName = accountUserName;
            this.accountUserSurname = accountUserSurname;
        }

        public String getUserAccountLogin() {

            Logger.log("Entered the method Account.getUserAccountLogin(), without log \"Exited\";");
            return accountUserLogin;
        }

        public void setUserAccountLogin(String accountUserLogin) {

            Logger.log("Entered the method Account.setUserAccountLogin(), without log \"Exited\";");
            this.accountUserLogin = accountUserLogin;
        }

        public String getUserAccountPassword() {

            Logger.log("Entered the method Account.getUserAccountPassword(), without log \"Exited\";");
            return accountUserPassword;
        }

        /**
         * @param accountUserPassword    current account user's password
         * @param newAccountUserPassword new account user's password
         * @return true, if the account password was entered correctly and the new password differs from the old one,
         * false - in another case
         */
        public boolean setUserAccountPassword(String accountUserPassword, String newAccountUserPassword) {

            boolean newPasswordSetting = false;

            Logger.log("Entered the method Account.getUserAccountID();");
            if (accountUserPassword.equals(this.accountUserPassword) &&
                    !accountUserPassword.equals(newAccountUserPassword)) {
                this.accountUserPassword = newAccountUserPassword;
                newPasswordSetting = true;
            }
            Logger.log("Exited the method AccountDatabase.setUserAccountPassword();");
            return newPasswordSetting;
        }

        public String getUserAccountID() {

            Logger.log("Entered the method Account.getUserAccountID(), without log \"Exited\";");
            return accountUserID;
        }

        public void setUserAccountID(String accountUserID) {

            Logger.log("Entered the method Account.setUserAccountID(), without log \"Exited\";");
            this.accountUserID = accountUserID;
        }

        public String getUserAccountName() {

            Logger.log("Entered the method Account.getUserAccountName(), without log \"Exited\";");
            return account.accountUserName;
        }

        public void setUserAccountName(String accountUserName) {

            Logger.log("Entered the method Account.setUserAccountName(), without log \"Exited\";");
            this.accountUserName = accountUserName;
        }

        public String getUserAccountSurname() {

            Logger.log("Entered the method Account.getUserAccountSurname(), without log \"Exited\";");
            return accountUserSurname;
        }

        public void setUserAccountSurname(String accountUserSurname) {

            Logger.log("Entered the method Account.setUserAccountSurname(), without log \"Exited\";");
            this.accountUserSurname = accountUserSurname;
        }
    }
}


