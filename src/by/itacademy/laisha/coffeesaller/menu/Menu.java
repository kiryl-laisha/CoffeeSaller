package by.itacademy.laisha.coffeesaller.menu;

import by.itacademy.laisha.coffeesaller.screen.Screen;

import java.util.Scanner;

public class Menu {
    private int menuItemSelection;
    private boolean correctMenuChoice;
    Screen screen = new Screen();
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        if (!correctMenuChoice) {
            screen.printScreen("Please, choice your action: (now only 1)");
            screen.printScreen("1 - load a vehicle;");
            screen.printScreen("2 - view loaded vehicle;");
            screen.printScreen("3 - view food product sorting.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                    correctMenuChoice = true;
                    break;
                default:
                    screen.printScreen("Invalid choice of menu action, please, try again.");
            }
        }
    }

    public int getMenuItemSelection() {
        return menuItemSelection;
    }
}


