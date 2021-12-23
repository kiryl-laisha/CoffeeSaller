package by.itacademy.laisha.foodproductseller.entities;

import by.itacademy.laisha.foodproductseller.utils.Logger;
import by.itacademy.laisha.foodproductseller.utils.MenuUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Coffee extends FoodProduct {

    private static final String INPUT_FOLDER = "src\\by\\itacademy\\laisha\\foodproductseller\\files\\input\\";
    private static final String FOOD_PRODUCT_CLASS = "Coffee";
    private static ArrayList<Coffee> coffees;
    private static ArrayList<String> coffeeTypes = new ArrayList<>();


    private static final BeanCoffee beanCoffee = new BeanCoffee();
    private static final GroundCoffee groundCoffee = new GroundCoffee();
    private static final InstantBagsCoffee instantBagsCoffee = new InstantBagsCoffee();
    private static final InstantCansCoffee instantCansCoffee = new InstantCansCoffee();

    public Coffee() {
    }

    public Coffee(String foodProductType, String foodProductBrand, int foodProductQuantity,
                  double foodProductPrice, double foodProductWeight, double foodProductVolume) {
        super(FOOD_PRODUCT_CLASS, foodProductType, foodProductBrand, foodProductQuantity,
                foodProductPrice, foodProductWeight, foodProductVolume);
    }

    public static void loadCoffeeDatabase() {
        addCoffeeType("Beans");
        addCoffeeType("Ground");
        addCoffeeType("Packaged");
        addCoffeeType("Instant");
        Scanner scanner = null;
        try {
            coffees = new ArrayList<>();
            for (String coffeeType : coffeeTypes) {
                scanner = new Scanner(new BufferedReader(new FileReader(INPUT_FOLDER +
                        coffeeType.toLowerCase() + FOOD_PRODUCT_CLASS.toLowerCase() + ".txt"))).useDelimiter(";");
                while (scanner.hasNextLine()) {
                    coffees.add(new Coffee(scanner.next().trim(), scanner.next().trim(),
                            Integer.parseInt(scanner.next().trim()), Double.parseDouble(scanner.next().trim()),
                            Double.parseDouble(scanner.next().trim()), Double.parseDouble(scanner.next().trim())));
                }
                scanner.close();
            }
            Logger.log("The coffee database has been loaded.");
        } catch (FileNotFoundException fileNotFoundException) {
            Logger.log("The named file was not found or for some other reason could not be opened for reading.");
        } catch (NullPointerException nullPointerException) {
            Logger.log("The named file is empty.");
        } catch (NoSuchElementException noSuchElementException) {
            Logger.log("The named file does not contain the required amount of information.");
        } catch (Exception exception) {
            Logger.log("The coffee database has been loaded incorrectly.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void addFoodProduct(String FOOD_PRODUCT_TYPE, String foodProductBrand, double foodProductVolume, double foodProductWeight, double foodProductPrice, int foodProductQuantity) {
    }

    public static void addCoffeeType(String coffeeType) {
        if (coffeeType.equals("new type")) {
            coffeeTypes.add(MenuUtils.getFoodProductType(FOOD_PRODUCT_CLASS));
        } else {
            coffeeTypes.add(coffeeType);
        }
    }


}
