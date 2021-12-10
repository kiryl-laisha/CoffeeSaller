package by.itacademy.laisha.coffeesaller;
import by.itacademy.laisha.coffeesaller.account.Account;
import by.itacademy.laisha.coffeesaller.screen.Screen;
import by.itacademy.laisha.coffeesaller.user.Manager;


public class Saller {

    public static void main(String[] args) {

        int authorisedUserAccessParameter;

        //Account's initialize
        Account account = new Account();
        authorisedUserAccessParameter = account.getAuthorisedUserAccessParameter();
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
            default:{
                Screen screen = new Screen();
                screen.printScreen("Invalid choice of type user's access. Please, try to authorise again.");
                Account account = new Account();
            }
        }
    }

    private static void createManager() {
        Manager manager = new Manager();
        manager.createDataBase();
        manager.choiceMenu();
    }

    private static void createDirector() {//TODO need complete
    }

    private static void createEngineer() {//TODO need complete
    }

    private static void createEconomist() {//TODO need complete
    }
}
