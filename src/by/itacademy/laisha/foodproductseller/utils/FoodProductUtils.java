package by.itacademy.laisha.foodproductseller.utils;

import by.itacademy.laisha.foodproductseller.entities.Coffee;
import by.itacademy.laisha.foodproductseller.enums.FoodProductClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

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

    public static void addFoodProductType(String productClass) {

        Logger.log("Entered the method FoodProductUtils.addFoodProductType();");
        if (productClass.equals(FoodProductClasses.COFFEE.getProductClass())) {
            coffeeTypes.add(MenuUtils.getTypeOfFoodProductClass(FoodProductClasses.COFFEE.getProductClass()));
            Logger.log("Exited the method FoodProductUtils.addFoodProductType();");
        }
    }

        public static ArrayList<String> getCoffeeTypes () {
            ArrayList<String> copyCoffeeTypes = new ArrayList<>(coffeeTypes);
            return copyCoffeeTypes;
        }

        public static void addFoodProductPosition (String productClass){

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

        private static void addCoffee () {

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
    }

