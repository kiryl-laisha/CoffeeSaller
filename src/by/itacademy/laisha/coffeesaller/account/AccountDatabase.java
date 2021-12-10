package by.itacademy.laisha.coffeesaller.account;

public class AccountDatabase {
    private boolean authorization;
    private int accountId = -1;
    private int userAccessParameter;

    public AccountDatabase() {
    }

    public boolean getAuthorization(String accountLogin, String accountPassword) {//TODO check by collection
        if (accountLogin.equals("troshkin") && accountPassword.equals("1234")) {
            authorization = true;
            this.accountId = 0;
            userAccessParameter = 1;
        } else if (accountLogin.equals("laisha") && (accountPassword.equals("12345"))) {
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
}
