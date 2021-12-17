package by.itacademy.laisha.coffeesaller;

import by.itacademy.laisha.coffeesaller.account.AccountInitialization;
import by.itacademy.laisha.coffeesaller.account.AccountDatabase;
import by.itacademy.laisha.coffeesaller.services.Manager;
import by.itacademy.laisha.coffeesaller.utils.ScreenUtils;

public final class SellerStart {


    private static AccountDatabase accountdb = new AccountDatabase();
    private static ScreenUtils screenUtils = new ScreenUtils();


    public static void main(String[] args) {

        //AccountLogin initialization
        try {
            AccountInitialization.initializeAccount();

            //InitialisationManager.initialisation();
            //InitialisationManager.menu();
        } catch (Exception exception) {  //TODO set the necessary exception (NoSuchElementException?)
            // Logger.log(e);
            System.out.println("ОШИБКА. Проверьте корректность файлов и перезапустите приложение.");
        }


        int authorisedUserAccessParameter;


        authorisedUserAccessParameter = AccountInitialization.getAuthorisedUserAccessParameter();
        //System.out.println("authorisedUserAccessParameter = " + authorisedUserAccessParameter);
        choiceTypeOfUserAccess(authorisedUserAccessParameter);
    }

    private static void choiceTypeOfUserAccess(int accessParameter) {
        switch (accessParameter) {
            case 1:
                createManager();
                break;
            case 2:
                createEconomist();
                break;
            case 3:
                createEngineer();
                break;
            case 4:
                createDirector();
                break;
            default: {
                screenUtils.printString("Invalid choice of type user's access. Please, try to authorise again.");
                AccountInitialization accountInisialization = new AccountInitialization();
            }
        }
    }

    private static void createManager() {
        Manager manager = new Manager();
        while (!manager.workInMainMenu()) {
        }
        screenUtils.printString("Exit had completed. Good bye, " + accountdb.getUserName() + "!");
    }

    private static void createDirector() {//TODO need complete
    }

    private static void createEngineer() {//TODO need complete
    }

    private static void createEconomist() {//TODO need complete
    }
}
