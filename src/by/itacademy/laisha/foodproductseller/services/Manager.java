package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.entities.Coffee;
import by.itacademy.laisha.foodproductseller.enums.FoodProductClasses;
import by.itacademy.laisha.foodproductseller.enums.VehicleTypes;
import by.itacademy.laisha.foodproductseller.utils.*;

import java.util.ArrayList;
import java.util.Collections;

public class Manager {

    private static ArrayList<Coffee> coffees;

    // loading of databases
    public static void loadDatabases() {

        Logger.log("Entered the method Manager.loadDatabases();");
        Warehouse.loadWarehouseDatabases();
        Transport.loadTransportDatabases();
        Logger.log("Exited the method Manager.loadDatabases();");
    }

    public static void workInMainMenu() {

        Logger.log("Entered the method Manager.workInMainMenu();");
        exit:
        {
            while (true) {
                mainMenu:
                {
                    ScreenUtils.printFramedString(
                            " Menu of the \"Food product Seller\".\n" +
                                    " Please, choice your action:\n" +
                                    " 1 - Warehouse;\n" +
                                    " 2 - Transport;\n" +
                                    " 3 - Exit;");
                    switch (MenuUtils.getSelectedItem(3)) {
                        case 1:
                            while (true) {
                                warehouseMenu:
                                {
                                    ScreenUtils.printFramedString(
                                            " A warehouse of the \"Food product Seller\".\n" +
                                                    " Please, choice your action:\n" +
                                                    " 1 - View a class \"Coffee\";\n" +
                                                    " 2 - View a class \"Tea\";\n" +
                                                    " 3 - View a class \"Water\";\n" +
                                                    " 4 - Form an order;\n" +
                                                    " 5 - Back;");
                                    switch (MenuUtils.getSelectedItem(5)) {
                                        case 1:
                                            while (true) {
                                                coffeeMenu:
                                                {
                                                    ScreenUtils.printFramedString(
                                                            " The class \"Coffee\".\n" +
                                                                    " Please, choice your action:\n" +
                                                                    " 1 - View class positions;\n" +
                                                                    " 2 - The class menu \"Adding\";\n" +
                                                                    " 3 - The class menu \"Sorting\";\n" +
                                                                    " 4 - Back;");
                                                    switch (MenuUtils.getSelectedItem(4)) {
                                                        case 1:
                                                            ScreenUtils.printCoffeesTable(
                                                                    " The class \"Coffee\" positions.",
                                                                    (WarehouseUtils.getCoffees()));
                                                            break;
                                                        case 2:
                                                            while (true) {
                                                                ScreenUtils.printFramedString(
                                                                        " The class \"Coffee\" menu \"Adding\".\n" +
                                                                                " Please, choice your action:\n" +
                                                                                " 1 - Add a new class type position;\n" +
                                                                                " 2 - Add a new class type ;\n" +
                                                                                " 3 - Back;");
                                                                switch (MenuUtils.getSelectedItem(3)) {
                                                                    case 1:
                                                                        FoodProductUtils.addFoodProductPosition(
                                                                                FoodProductClasses.COFFEE.getProductClass());
                                                                        break;
                                                                    case 2:
                                                                        FoodProductUtils.addFoodProductType(
                                                                                FoodProductClasses.COFFEE.getProductClass());
                                                                        break;
                                                                    case 3:
                                                                        break coffeeMenu;
                                                                }
                                                            }
                                                        case 3:
                                                            while (true) {
                                                                ScreenUtils.printFramedString(
                                                                        " The class \"Coffee\" menu \"Sorting\".\n" +
                                                                                " Please, choice your action:\n" +
                                                                                " 1 - Sort the class by types;\n" +
                                                                                " 2 - Sort the class by brands;\n" +
                                                                                " 3 - Sort the class by quantities;\n" +
                                                                                " 4 - Sort the class by prices;\n" +
                                                                                " 5 - Sort the class by weights;\n" +
                                                                                " 6 - Sort the class by volumes;\n" +
                                                                                " 7 - Back;");
                                                                switch (MenuUtils.getSelectedItem(7)) {
                                                                    case 1:
                                                                        sortCoffeePositionsByTypes();
                                                                        break;
                                                                    case 2:
                                                                        sortCoffeePositionsByBrands();
                                                                        break;
                                                                    case 3:
                                                                        sortCoffeePositionsByQuantities();
                                                                        break;
                                                                    case 4:
                                                                        sortCoffeePositionsByPrices();
                                                                        break;
                                                                    case 5:
                                                                        sortCoffeePositionsByWeights();
                                                                        break;
                                                                    case 6:
                                                                        sortCoffeePositionsByVolumes();
                                                                        break;
                                                                    case 7:
                                                                        break coffeeMenu;
                                                                }
                                                            }
                                                        case 4:
                                                            break warehouseMenu;
                                                    }
                                                }
                                            }
                                        case 2:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the class \"Tea\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 3:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the class \"Water\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 4:
                                            formOrder();
                                            break;
                                        case 5:
                                            break mainMenu;
                                    }
                                }
                            }
                        case 2:
                            while (true) {
                                transportMenu:
                                {
                                    ScreenUtils.printFramedString(
                                            " A transport of the \"Food product Seller\".\n" +
                                                    " Please, choice your action:\n" +
                                                    " 1 - View a type \"Cargovan\";\n" +
                                                    " 2 - View a type \"Minivan\";\n" +
                                                    " 3 - View a type \"Car\";\n" +
                                                    " 4 - Back;");
                                    switch (MenuUtils.getSelectedItem(4)) {
                                        case 1:
                                            while (true) {
                                                cargovanMenu:
                                                {
                                                    ScreenUtils.printFramedString(
                                                            " The type \"Cargovan\".\n" +
                                                                    " Please, choice your action:\n" +
                                                                    " 1 - View type positions;\n" +
                                                                    " 2 - The type menu \"Adding\";\n" +
                                                                    " 3 - The type menu \"Sorting\";\n" +
                                                                    " 4 - Back;");
                                                    switch (MenuUtils.getSelectedItem(4)) {
                                                        case 1:
                                                            ScreenUtils.printCargovansTable(
                                                                    " The type \"Cargovan\" positions.",
                                                                    (TransportUtils.getCargovans()));
                                                            break;
                                                        case 2:
                                                            while (true) {
                                                                ScreenUtils.printFramedString(
                                                                        " The type \"Cargovan\" menu \"Adding\".\n" +
                                                                                " Please, choice your action:\n" +
                                                                                " 1 - Add a new type position;\n" +
                                                                                " 2 - Edit an exist type position;\n" +
                                                                                " 3 - Back;");
                                                                switch (MenuUtils.getSelectedItem(3)) {
                                                                    case 1:
                                                                        TransportUtils.addVehiclePosition(
                                                                                VehicleTypes.CARGOVAN.getVehicleType());
                                                                        break;
                                                                    case 2:
                                                                        ScreenUtils.printStrip();
                                                                        ScreenUtils.printString("Unfortunately, this " +
                                                                                "chapter has not been developed yet.");
                                                                        break;
                                                                    case 3:
                                                                        break cargovanMenu;
                                                                }
                                                            }
                                                        case 3:
                                                            ScreenUtils.printStrip();
                                                            ScreenUtils.printString("Unfortunately, this " +
                                                                    "chapter has not been developed yet.");
                                                            break;
                                                        case 4:
                                                            break transportMenu;
                                                    }
                                                }
                                            }
                                        case 2:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the type \"Minivan\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 3:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the type \"Car\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 4:
                                            break mainMenu;
                                    }
                                }
                            }
                        case 3:
                            break exit;
                    }
                }
            }
        }
        Logger.log("Exited the method Manager.workInMainMenu();");
    }

    private static void formOrder() {

    }

    private static void sortCoffeePositionsByTypes() {

        Logger.log("Entered the method Manager.sortCoffeePositionsByTypes();");
        sortingByTypes:
        {
            while (true) {
                ScreenUtils.printFramedString(
                        " Sort the class \"Coffee\".\n" +
                                " Please, choice your action:\n" +
                                " 1 - Sort the class types ascending;\n" +
                                " 2 - Sort the class types descending;\n" +
                                " 3 - Back;");
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees);
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" types ascending.", coffees);
                        break;
                    case 2:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees,
                                new CoffeeTypesDesсendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" types descending.", coffees);
                        break;
                    case 3:
                        break sortingByTypes;
                }
            }
        }
        Logger.log("Exited the method Manager.sortCoffeePositionsByTypes();");
    }

    private static void sortCoffeePositionsByBrands() {

        Logger.log("Entered the method Manager.sortCoffeePositionsByBrands();");
        sortingByBrands:
        {
            while (true) {
                ScreenUtils.printFramedString(
                        " Sort the class \"Coffee\".\n" +
                                " Please, choice your action:\n" +
                                " 1 - Sort the class positions brands ascending;\n" +
                                " 2 - Sort the class positions brands descending;\n" +
                                " 3 - Back;");
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeBrandsAscendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions brands ascending.", coffees);
                        break;
                    case 2:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeBrandsDescendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions brands descending.", coffees);
                        break;
                    case 3:
                        break sortingByBrands;
                }
            }
        }
        Logger.log("Exited the method Manager.sortCoffeePositionsByBrands();");
    }

    private static void sortCoffeePositionsByQuantities() {

        Logger.log("Entered the method Manager.sortCoffeePositionsByQuantities();");
        sortingByQuantities:
        {
            while (true) {
                ScreenUtils.printFramedString(
                        " Sort the class \"Coffee\".\n" +
                                " Please, choice your action:\n" +
                                " 1 - Sort the class positions quantities ascending;\n" +
                                " 2 - Sort the class positions quantities descending;\n" +
                                " 3 - Back;");
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeQuantitiesAscendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions quantities ascending.", coffees);
                        break;
                    case 2:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees,
                                new CoffeeQuantitiesDescendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions quantities descending.", coffees);
                        break;
                    case 3:
                        break sortingByQuantities;
                }
            }
        }
        Logger.log("Exited the method Manager.sortCoffeePositionsByQuantities();");
    }

    private static void sortCoffeePositionsByPrices() {

        Logger.log("Entered the method Manager.sortCoffeePositionsByPrices();");
        sortingByPrices:
        {
            while (true) {
                ScreenUtils.printFramedString(
                        " Sort the class \"Coffee\".\n" +
                                " Please, choice your action:\n" +
                                " 1 - Sort the class positions prices ascending;\n" +
                                " 2 - Sort the class positions prices descending;\n" +
                                " 3 - Back;");
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeePricesAscendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions prices ascending.", coffees);
                        break;
                    case 2:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees,
                                new CoffeePricesDescendingComparator());
                        ScreenUtils.printCoffeesTable(
                                " The sorting class \"Coffee\" " +
                                        "positions prices descending.", coffees);
                        break;
                    case 3:
                        break sortingByPrices;
                }
            }
        }
        Logger.log("Exited the method Manager.sortCoffeePositionsByPrices();");
    }

    private static void sortCoffeePositionsByWeights() {

        Logger.log("Entered the method Manager.sortCoffeePositionsByWeights();");
        sortingByWeights:
        {
            while (true) {
                ScreenUtils.printFramedString(
                        " Sort the class \"Coffee\".\n" +
                                " Please, choice your action:\n" +
                                " 1 - Sort the class positions weights ascending;\n" +
                                " 2 - Sort the class positions weights descending;\n" +
                                " 3 - Back;");
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeWeightsAscendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions weights ascending.", coffees);
                        break;
                    case 2:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeWeightsDescendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions weights descending.", coffees);
                        break;
                    case 3:
                        break sortingByWeights;
                }
            }
        }
        Logger.log("Exited the method Manager.sortCoffeePositionsByWeights();");
    }

    private static void sortCoffeePositionsByVolumes() {

        Logger.log("Entered the method Manager.sortCoffeePositionsByVolumes();");
        sortingByVolumes:
        {
            while (true) {
                ScreenUtils.printFramedString(
                        " Sort the class \"Coffee\".\n" +
                                " Please, choice your action:\n" +
                                " 1 - Sort the class positions volumes ascending;\n" +
                                " 2 - Sort the class positions volumes descending;\n" +
                                " 3 - Back;");
                switch (MenuUtils.getSelectedItem(3)) {
                    case 1:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeWeightsAscendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions volumes ascending.", coffees);
                        break;
                    case 2:
                        coffees = WarehouseUtils.getCoffees();
                        Collections.sort(coffees, new CoffeeWeightsDescendingComparator());
                        ScreenUtils.printCoffeesTable(" The sorting class " +
                                "\"Coffee\" positions volumes descending.", coffees);
                        break;
                    case 3:
                        break sortingByVolumes;
                }
            }
        }
        Logger.log("Exited the method Manager.sortCoffeePositionsByVolumes();");
    }
}





