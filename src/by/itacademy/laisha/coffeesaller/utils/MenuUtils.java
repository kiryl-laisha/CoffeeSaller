package by.itacademy.laisha.coffeesaller.utils;

import java.util.Scanner;

public class MenuUtils {
    private static int menuItemSelection;
    private static boolean correctMenuChoice;
    private static ScreenUtils screenUtil = new ScreenUtils();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);

    public MenuUtils() {
    }

    public int getMainMenuItemSelection() {
        menuItemSelection = 0;
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - view transport;");
            screenUtil.printString("2 - view warehouse;");
            screenUtil.printString("3 - collect an application;");
            screenUtil.printString("4 - exit.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of main menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public int getTransportMenuItemSelection() {
        correctMenuChoice = false;
        while (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - view all vehicles;");
            screenUtil.printString("2 - view free vehicles;");
            screenUtil.printString("3 - add a vehicle;");
            screenUtil.printString("4 - back to the main menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of transport menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public String addNewVehicleBrand() {
        screenUtil.printString("Please, set brand of the vehicle:");
        return scanner2.nextLine();
    }

    public String addNewVehicleModel() {
        screenUtil.printString("Please, set model of the vehicle:");
        return scanner2.nextLine();
    }

    public String addNewVehicleMark() {
        screenUtil.printString("Please, set mark of the vehicle:");
        return scanner2.nextLine();
    }


    public double addNewVehicleVolume() {
        screenUtil.printString("Please, set volume of the vehicle:");
        return scanner.nextDouble();
    }


    public int getWarehouseMenuItemSelection() {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - view section \"Coffee\";");
            screenUtil.printString("2 - view section \"Tea\";");
            screenUtil.printString("3 - view section \"Water\";");
            screenUtil.printString("4 - back to the main menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of warehouse menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public int getCoffeeMenuItemSelection() {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - view bean coffee;");
            screenUtil.printString("2 - view ground coffee;");
            screenUtil.printString("3 - view instant cans coffee;");
            screenUtil.printString("4 - view instant bags coffee;");
            screenUtil.printString("5 - view all coffees;");
            screenUtil.printString("6 - add a coffee;");
            screenUtil.printString("7 - back to the warehouse menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of coffee menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public int getCoffeeAddingMenuItemSelection() {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - add a bean coffee;");
            screenUtil.printString("2 - add a ground coffee;");
            screenUtil.printString("3 - add a instant bags coffee;");
            screenUtil.printString("4 - add a instant cans coffee;");
            screenUtil.printString("5 - back to the coffee menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of coffee adding menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public String addNewFoodProductBrand(String foodProductType) {
        screenUtil.printString("Please, set brand of the " + foodProductType + ":");
        return scanner2.nextLine();
    }

    public double addNewFoodProductWeight(String foodProductType) {
        screenUtil.printString("Please, set weight (gram) of the " + foodProductType + ":");
        return scanner.nextDouble();
    }

    public double addNewCoffeeVolume(String foodProductType) {
        screenUtil.printString("Please, set volume (m3) of the " + foodProductType + ":");
        return scanner.nextDouble();
    }

    public double addNewCoffeePrice(String foodProductType) {
        screenUtil.printString("Please, set price ($) of the " + foodProductType + ":");
        return scanner.nextDouble();
    }

    public int addNewCoffeeQuantity(String foodProductType) {
        screenUtil.printString("Please, set quantity (things) of the " + foodProductType + ":");
        return scanner.nextInt();
    }

    public int getSortCoffeeMenuSelection(String coffeeType) {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - sort " + coffeeType + " by price (from minimum to maximum);");
            screenUtil.printString("2 - sort " + coffeeType + " by weight (from minimum to maximum);");
            screenUtil.printString("3 - back to the coffee menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of bean coffee sorting menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public int getCollectionMenuItemSelection() {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - collect in section \"Coffee\";");
            screenUtil.printString("2 - collect in section \"Tea\";");
            screenUtil.printString("3 - collect in section \"Water\";");
            screenUtil.printString("4 - confirm selection;");
            screenUtil.printString("5 - save selection and back to the main menu.");
            screenUtil.printString("6 - cancel selection and back to the main menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of collection menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public int getCoffeeCollectionMenuItemSelection() {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice your action:");
            screenUtil.printString("1 - collect in section \"Bean coffee\";");
            screenUtil.printString("2 - collect in section \"Ground coffee\";");
            screenUtil.printString("3 - collect in section \"Instant bags coffee\";");
            screenUtil.printString("4 - collect in section \"Instant cans coffee\";");
            screenUtil.printString("5 - confirm selection;");
            screenUtil.printString("6 - save selection and back to the collection menu.");
            screenUtil.printString("7 - cancel selection and back to the collection menu.");
            menuItemSelection = scanner.nextInt();
            switch (menuItemSelection) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    correctMenuChoice = true;
                    break;
                default:
                    screenUtil.printString("Invalid choice of coffee collection menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public int getFoodProductCollectionMenuItemSelection(String FOOD_PRODUCT_TYPE, int itemCounter) {
        correctMenuChoice = false;
        if (!correctMenuChoice) {
            menuItemSelection = 0;
            screenUtil.printString("Please, choice item of " + FOOD_PRODUCT_TYPE + ": (for back to the collection menu choice \"0\")");
            menuItemSelection = scanner.nextInt();
            if (menuItemSelection >= 0 && menuItemSelection <= itemCounter) {
                correctMenuChoice = true;
            } else {
                screenUtil.printString("Invalid choice of " + FOOD_PRODUCT_TYPE + " collection menu action, please, try again.");
            }
        }
        return menuItemSelection;
    }

    public double selectFoodProductQuantity() {
       // screenUtil.printString("Please, select a quantity of " + FOOD_PRODUCT_TYPE + ": (for back to the collection menu choice \"0\")");
        menuItemSelection = scanner.nextInt();
        return 1.;
    }
}