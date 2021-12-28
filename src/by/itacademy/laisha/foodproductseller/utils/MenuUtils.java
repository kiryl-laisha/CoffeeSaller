package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Coffee;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuUtils {

    private static Scanner scanner;

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
        int selectedItem;
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
                    if (itemAvailability.equals("1")) {
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

    public static int getChosenPositionQuantity(int selectedPositionItem, ArrayList<Coffee> remainingCoffees) {

        String selectedPositionQuantity = "";

        Logger.log("Entered the method MenuUtils.getChosenPositionQuantity();");
        try {
            do {
                ScreenUtils.printFramedString("Enter a quantity of the chosen position (things), please:\n" +
                        "(for back enter 0)");
                selectedPositionQuantity = scanner.nextLine();
                if (Pattern.matches("[0-9]+", selectedPositionQuantity)) {
                    if (Integer.parseInt(selectedPositionQuantity) <=
                            (remainingCoffees.get(selectedPositionItem - 1).getFoodProductQuantity())) {
                        break;
                    } else {
                        ScreenUtils.printFramedString("You have chosen " +
                                "the quantity of this position more then there is in a warehouse:");
                    }
                } else {
                    ScreenUtils.printFramedString("Allowed to use only arabic numbers.");
                }
            } while (true);
        } catch (NoSuchElementException noSuchElementException) {
            ScreenUtils.printString("A quantity string has not been found.");
            Logger.log("A quantity string has been read failed;");
        }
        Logger.log("Exited the method MenuUtils.getChosenPositionQuantity();");
        return Integer.parseInt(selectedPositionQuantity);

    }
}

