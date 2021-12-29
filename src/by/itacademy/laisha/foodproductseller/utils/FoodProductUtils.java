package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Coffee;
import by.itacademy.laisha.foodproductseller.entities.FoodProduct;
import by.itacademy.laisha.foodproductseller.enums.FoodProductClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public final class FoodProductUtils {

    private static final String INPUT_FILES_FOLDER = "src\\by\\itacademy\\laisha\\foodproductseller\\files\\input\\";

    private static ArrayList<Coffee> coffees;
    private static ArrayList<String> coffeeTypes;

    public static ArrayList<Coffee> loadCoffeeDatabase() {

        coffeeTypes = new ArrayList<>();
        coffees = new ArrayList<>();

        Logger.log("Entered the method FoodProductUtils.loadCoffeeDatabase();");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(INPUT_FILES_FOLDER +
                    "coffeetypes" + ".txt")));
            while (scanner.hasNextLine()) {
                coffeeTypes.add(scanner.nextLine().trim());
            }
            scanner.close();
            for (String coffeeType : coffeeTypes) {
                scanner = new Scanner(new BufferedReader(new FileReader(INPUT_FILES_FOLDER +
                        coffeeType.toLowerCase() + FoodProductClasses.COFFEE.getProductClass().toLowerCase() +
                        ".txt"))).useDelimiter(";");
                while (scanner.hasNextLine()) {//TODO may be new empty file, when new type has been created
                    coffees.add(new Coffee(scanner.next().trim(), scanner.next().trim(),
                            Integer.parseInt(scanner.next().trim()), Double.parseDouble(scanner.next().trim()),
                            Double.parseDouble(scanner.next().trim()), Double.parseDouble(scanner.next().trim())));
                }
                scanner.close();
            }
            Logger.log("The coffee database has been loaded;");
        } catch (FileNotFoundException fileNotFoundException) {
            Logger.log("The named file was not found or for some other reason could not be opened for reading;");
        } catch (NullPointerException nullPointerException) {
            Logger.log("The named file is empty;");
        } catch (NoSuchElementException noSuchElementException) {
            Logger.log("The named file does not contain the required amount of information;");
        } catch (Exception exception) {
            Logger.log("The coffee database has been loaded incorrectly;");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        Logger.log("The coffee database has been loaded;\n" +
                "Exited the method FoodProductUtils.loadCoffeeDatabase();");
        return coffees;
    }

    public static void saveCoffeeDatabase() {

        Logger.log("Entered the method FoodProductUtils.saveCoffeeDatabase();");

        Logger.log("The coffee database has been saved;\n" +
                "Exited the method FoodProductUtils.saveCoffeeDatabase();");
    }

    public static void addFoodProductType(String productClass) {

        Logger.log("Entered the method FoodProductUtils.addFoodProductType();");
        if (productClass.equals(FoodProductClasses.COFFEE.getProductClass())) {
            coffeeTypes.add(MenuUtils.getTypeOfFoodProductClass(FoodProductClasses.COFFEE.getProductClass()));
            Logger.log("Exited the method FoodProductUtils.addFoodProductType();");
        }
    }

    public static ArrayList<String> getCoffeeTypes() {
        return new ArrayList<>(coffeeTypes);
    }

    public static void addFoodProductPosition(String productClass) {

        Logger.log("Entered the method FoodProductUtils.addFoodProductPosition();");
        if (productClass.equals(FoodProductClasses.COFFEE.getProductClass())) {
            ScreenUtils.printFoodProductTypesForChoice(FoodProductUtils.getCoffeeTypes(),
                    FoodProductClasses.COFFEE.getProductClass());
            addCoffee();
        }
        /* This block will be used for expanding of the program
        if (productClass.equals(FoodProductClasses.TEA.getProductClass())) {
            ScreenUtils.printFoodProductTypesForChoice(FoodProductUtils.getTeaTypes(),
                    FoodProductClasses.TEA.getProductClass());
            addTea();
        }
        if (productClass.equals(FoodProductClasses.WATER.getProductClass())) {
           ScreenUtils.printFoodProductTypesForChoice(FoodProductUtils.getWaterTypes(),
                    FoodProductClasses.WATER.getProductClass());
            addWater();
        }
        */
        Logger.log("Exited the method FoodProductUtils.addFoodProductPosition();");
    }

    private static void addCoffee() {

        Logger.log("Entered the method FoodProductUtils.addCoffee();");
        coffees.add(new Coffee(FoodProductUtils.getCoffeeTypes().get(
                MenuUtils.getSelectedItem(FoodProductUtils.getCoffeeTypes().size()) - 1),
                MenuUtils.getNewPositionBrand(),
                MenuUtils.getNewPositionQuantity(),
                MenuUtils.getNewPositionPrice(),
                MenuUtils.getNewPositionWeight(),
                MenuUtils.getNewPositionVolume()));
        Logger.log("Exited the method FoodProductUtils.addCoffee();");
    }

    public static void sortCoffeePositions(String descriptionName, String sortingTypeName, ArrayList<Coffee> coffees) {

        Logger.log("Entered the method FoodProductUtils.sortCoffeePositions();");
        sorting:
        {
            while (true) {
                ScreenUtils.printMenuForChoiceSortingType(descriptionName + sortingTypeName);
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        sortAscendingCoffeePositionsByChosenSortingType(sortingTypeName, coffees);
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" " + descriptionName + " " + sortingTypeName + " ascending.", coffees);
                        break;
                    case 2:
                        sortDescendingCoffeePositionsByChosenSortingType(sortingTypeName, coffees);
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" " + descriptionName + " " + sortingTypeName + " descending.", coffees);
                        break;
                    case 3:
                        break sorting;
                }
            }
        }
        Logger.log("Exited the method FoodProductUtils.sortCoffeePositionsByTypes();");
    }

    private static void sortAscendingCoffeePositionsByChosenSortingType(String sortingTypeName, ArrayList<Coffee> coffees) {

        Logger.log("Entered the method FoodProductUtils.sortAscendingCoffeePositionsByChosenSortingType();");
        switch (sortingTypeName) {
            case "types":
                coffees.sort(Comparator.comparing(
                        FoodProduct::getFoodProductType));
                break;
            case "position brands":
                coffees.sort(Comparator.comparing(
                        FoodProduct::getFoodProductBrand));
                break;
            case "position quantities":
                coffees.sort(Comparator.comparingInt(
                        FoodProduct::getFoodProductQuantity));
                break;
            case "position prices":
                coffees.sort(Comparator.comparingDouble(
                        FoodProduct::getFoodProductPrice));
                break;
            case "position weights":
                coffees.sort(Comparator.comparingDouble(
                        FoodProduct::getFoodProductWeight));
                break;
            case "position volumes":
                coffees.sort(Comparator.comparingDouble(
                        FoodProduct::getFoodProductVolume));
                break;
        }
        Logger.log("Exited the method FoodProductUtils.sortAscendingCoffeePositionsByChosenSortingType();");
    }

    private static void sortDescendingCoffeePositionsByChosenSortingType(String sortingTypeName,
                                                                         ArrayList<Coffee> coffees) {

        Logger.log("Entered the method FoodProductUtils.sortDescendingCoffeePositionsByChosenSortingType();");
        switch (sortingTypeName) {
            case "types":
                coffees.sort((Coffee firstCoffee, Coffee secondCoffee) ->
                        secondCoffee.getFoodProductType().compareTo(firstCoffee.getFoodProductType()));
                break;
            case "position brands":
                coffees.sort((Coffee firstCoffee, Coffee secondCoffee) ->
                        secondCoffee.getFoodProductBrand().compareTo(firstCoffee.getFoodProductBrand()));
                break;
            case "position quantities":
                coffees.sort((Coffee firstCoffee, Coffee secondCoffee) ->
                        Integer.compare(secondCoffee.getFoodProductQuantity(), firstCoffee.getFoodProductQuantity()));
                break;
            case "position prices":
                coffees.sort((Coffee firstCoffee, Coffee secondCoffee) ->
                        Double.compare(secondCoffee.getFoodProductPrice(), firstCoffee.getFoodProductPrice()));
                break;
            case "position weights":
                coffees.sort((Coffee firstCoffee, Coffee secondCoffee) ->
                        Double.compare(secondCoffee.getFoodProductWeight(), firstCoffee.getFoodProductWeight()));
                break;
            case "position volumes":
                coffees.sort((Coffee firstCoffee, Coffee secondCoffee) ->
                        Double.compare(secondCoffee.getFoodProductVolume(), firstCoffee.getFoodProductVolume()));
                break;
        }
        Logger.log("Exited the method FoodProductUtils.sortDescendingCoffeePositionsByChosenSortingType();");
    }
}

