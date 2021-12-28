package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Coffee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuUtils {
    private static int menuItemSelection;
    private static boolean correctMenuChoice;
    private static ScreenUtils screenUtil = new ScreenUtils();
    private static Scanner scanner;
    private Scanner scanner2 = new Scanner(System.in);

    public MenuUtils() {
    }

    public static String getTypeOfFoodProductClass(String foodProductClass) {

        String typeOfFoodProductClass = "";

        Logger.log("Entered the method MenuUtils.getTypeOfFoodProductClass();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a new type of the class \"" + foodProductClass + "\", please:");
                typeOfFoodProductClass = scanner.nextLine();
                if (Pattern.matches("^[A-Z]+-?[a-z]+", typeOfFoodProductClass)) {
                    ScreenUtils.printString("The entered type has been accepted!");
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use uppercase (only first) and \n" +
                            "lowercase letters and hyphen (optional).");
                }
            }
            while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A string has not been found for adding type of the class \""
                    + foodProductClass + "\".");
            Logger.log("A string has not been found for adding type of the class \""
                    + foodProductClass + "\".");
        }
        Logger.log("Exited the method MenuUtils.getTypeOfFoodProductClass();");
        return typeOfFoodProductClass;
    }

    public static int getSelectedItem(int itemNumber) {

        Logger.log("Entered the method MenuUtils.getSelectedItem(), number of item = " + itemNumber + ";");
        int selectedItem = 0;
        scanner = new Scanner(System.in);
        do {
            try {

                selectedItem = Integer.parseInt(scanner.nextLine().trim());
                if (selectedItem > 0 && selectedItem <= itemNumber) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Please, enter a number ot item from \"1\" " +
                            "to \"" + itemNumber + "\":");
                }

            } catch (NumberFormatException numberFormatException) {
                Logger.log("The entered string does not contain a parsable integer;");
                ScreenUtils.printFramedString("Only integers are allowed! Enter a number ot item from " +
                        "\"1\" to \"" + itemNumber + "\":");
            }
        } while (true);
        Logger.log("Exited the method MenuUtils.getSelectedItem();");
        return selectedItem;
    }

    public static String getNewPositionBrand() {

        String newPositionBrand = "";

        Logger.log("Entered the method MenuUtils.getNewPositionBrand();");
        scanner = new Scanner(System.in);
        try {
            do {
                ScreenUtils.printFramedString("Enter a brand of the new position, please:");
                newPositionBrand = scanner.nextLine();
                if (Pattern.matches("^[\\w][\\w\\p{Blank}-]+", newPositionBrand)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use lowercase and uppercase letters,\n" +
                            "arabic numbers and hyphen.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A brand string has not been found.");
            Logger.log("A brand string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionBrand();");
        return newPositionBrand;
    }

    public static int getNewPositionQuantity() {

        String newPositionQuantity = "";

        Logger.log("Entered the method MenuUtils.getNewPositionQuantity();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a quantity of the new position (things), please:");
                newPositionQuantity = scanner.nextLine();
                if (Pattern.matches("[0-9]+", newPositionQuantity)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use only arabic numbers.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A quantity string has not been found.");
            Logger.log("A quantity string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionQuantity();");
        return Integer.parseInt(newPositionQuantity);
    }

    public static double getNewPositionPrice() {

        String newPositionPrice = "";

        Logger.log("Entered the method MenuUtils.getNewPositionPrice();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a price of the new position ($), please:");
                newPositionPrice = scanner.nextLine();
                if (Pattern.matches("[0-9]*\\.?[0-9]*", newPositionPrice)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use only arabic numbers and dot.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A price string has not been found.");
            Logger.log("A price string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionPrice();");
        return Double.parseDouble(newPositionPrice);
    }

    public static double getNewPositionWeight() {

        String newPositionWeight = "";

        Logger.log("Entered the method MenuUtils.getNewPositionWeight();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a weight of the new position (gram), please:");
                newPositionWeight = scanner.nextLine();
                if (Pattern.matches("[0-9]*\\.?[0-9]*", newPositionWeight)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use only arabic numbers and a dot.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A weight string has not been found.");
            Logger.log("A weight string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionWeight();");
        return Double.parseDouble(newPositionWeight);
    }

    public static double getNewPositionVolume() {

        String newPositionVolume = "";

        Logger.log("Entered the method MenuUtils.getNewPositionVolume();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a volume of the new position (m3), please:");
                newPositionVolume = scanner.nextLine();
                if (Pattern.matches("[0-9]*\\.?[0-9]*", newPositionVolume)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use only arabic numbers and a dot.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A volume string has not been found.");
            Logger.log("A volume string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionVolume();");
        return Double.parseDouble(newPositionVolume);
    }

    public static String getNewPositionModel() {

        String newPositionModel = "";

        Logger.log("Entered the method MenuUtils.getNewPositionModel();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a model of the new position, please:");
                newPositionModel = scanner.nextLine();
                if (Pattern.matches("^[\\w][\\w\\p{Blank}]+", newPositionModel)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use lowercase and uppercase letters,\n" +
                            "and arabic numbers.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A model string has not been found.");
            Logger.log("A model string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionModel();");
        return newPositionModel;
    }

    public static String getNewPositionRegisterSign() {

        String newPositionRegisterSign = "";

        Logger.log("Entered the method MenuUtils.getNewPositionRegisterSign();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a register sign of the new position, please:");
                newPositionRegisterSign = scanner.nextLine();
                if (Pattern.matches("^[\\w][\\w\\p{Blank}-]+", newPositionRegisterSign)) {
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use lowercase and uppercase letters,\n" +
                            "arabic numbers and hyphen.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A register sign string has not been found.");
            Logger.log("A register sign string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionRegisterSign();");
        return newPositionRegisterSign;
    }

    public static boolean getNewPositionAvailability() {

        boolean newPositionAvailability = false;
        String itemAvailability;

        Logger.log("Entered the method MenuUtils.getNewPositionAvailability();");
        try {
            do {
                ScreenUtils.printFramedString("Enter an availability of the new position, please:\n" +
                        "1 - true;\n" +
                        "2 - false;");
                itemAvailability = scanner.nextLine();
                if (Pattern.matches("[1-2]", itemAvailability)) {
                    if (itemAvailability.equals("1"))   {
                        newPositionAvailability = true;
                    }
                    break;
                } else {
                    ScreenUtils.printFramedString("Allowed to use \"1\" and \"2\".");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("An availability string has not been found.");
            Logger.log("A availability string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getNewPositionAvailability();");
        return newPositionAvailability;

    }


    public int getMainMenuItemSelection() {
        menuItemSelection = 0;
        correctMenuChoice = false;
        if (!correctMenuChoice) {

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

