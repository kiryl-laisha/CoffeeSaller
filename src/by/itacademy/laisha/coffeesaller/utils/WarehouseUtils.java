package by.itacademy.laisha.coffeesaller.utils;

import by.itacademy.laisha.coffeesaller.entities.*;
import by.itacademy.laisha.coffeesaller.services.Warehouse;

import java.util.ArrayList;
import java.util.Collections;

public class WarehouseUtils {

    private static final BeanCoffee beanCoffee = new BeanCoffee();
    private static final GroundCoffee groundCoffee = new GroundCoffee();
    private static final InstantBagsCoffee instantBagsCoffee = new InstantBagsCoffee();
    private static final InstantCansCoffee instantCansCoffee = new InstantCansCoffee();
    private static final MenuUtils menuUtil = new MenuUtils();
    private static final ScreenUtils screenUtils = new ScreenUtils();
    private static ArrayList<BeanCoffee> beanCoffees = new ArrayList<BeanCoffee>();
    private static ArrayList<BeanCoffee> collectionBeanCoffees = new ArrayList<BeanCoffee>();
    private static ArrayList<BeanCoffee> residualBeanCoffees = new ArrayList<BeanCoffee>();
    private static ArrayList<GroundCoffee> groundCoffees = new ArrayList<GroundCoffee>();
    private static ArrayList<InstantBagsCoffee> instantBagsCoffees = new ArrayList<InstantBagsCoffee>();
    private static ArrayList<InstantCansCoffee> instantCansCoffees = new ArrayList<InstantCansCoffee>();
    private static final int FOODPRODUCT_TABLE_WIDTH = 119;


    public WarehouseUtils() {
    }

    public void createWarehouseDataBase() {
        Warehouse warehouse = new Warehouse();
        warehouse.loadWarehouseDataBase();
    }

    public boolean workInWarehouseMenu() {
        boolean returningInMainMenu;
        int WarehouseMenuItemSelection = menuUtil.getWarehouseMenuItemSelection();
        if (WarehouseMenuItemSelection != 4) {
            switch (WarehouseMenuItemSelection) {
                case 1: {
                    while (!workInCoffeeMenu()) {
                    }
                    break;
                }
                case 2: {
                    while (!workInTeaMenu()) {
                    }
                    break;
                }
                case 3: {
                    while (!workInWaterMenu()) {
                    }
                    break;
                }
            }
            returningInMainMenu = false;
        } else {
            returningInMainMenu = true;
        }
        return returningInMainMenu;
    }

    public boolean workInCollectionMenu() {
        boolean returningInMainMenu;
        int collectionMenuItemSelection = menuUtil.getCollectionMenuItemSelection();
        if (collectionMenuItemSelection != 6) {
            switch (collectionMenuItemSelection) {
                case 1: {
                    while (!workInCoffeeCollectionMenu()) {
                    }
                    break;
                }
                case 2: {
                    while (!workInTeaCollectionMenu()) {
                    }
                    break;
                }
                case 3: {
                    while (!workInWaterCollectionMenu()) {
                    }
                    break;
                }
            }
            returningInMainMenu = false;
        } else {
            returningInMainMenu = true;
        }
        return returningInMainMenu;
    }

    private boolean workInCoffeeCollectionMenu() {
        boolean returningInCollectionMenu;
        int coffeeCollectionMenuItemSelection = menuUtil.getCoffeeCollectionMenuItemSelection();
        if (coffeeCollectionMenuItemSelection != 6) {
            switch (coffeeCollectionMenuItemSelection) {
                case 1: {
                    collectionBeanCoffees.addAll(beanCoffee.getBeanCoffees());
                   // printBeanCoffeeTable();
                    selectBeanCoffees();
                    while (!workInCoffeeCollectionMenu()) {
                    }
                    break;
                }
                case 2: {
                    while (!workInTeaCollectionMenu()) {
                    }
                    break;
                }
                case 3: {
                    while (!workInWaterCollectionMenu()) {
                    }
                    break;
                }
            }
            returningInCollectionMenu = false;
        } else {
            returningInCollectionMenu = true;
        }
        return returningInCollectionMenu;

    }

    private boolean selectBeanCoffees() {
        boolean returningInCoffeeCollectionMenu;
        ArrayList<BeanCoffee> temporaryСollectionBeanCoffees = new ArrayList<BeanCoffee>();
        ArrayList<BeanCoffee> temporaryResidualBeanCoffees = new ArrayList<BeanCoffee>();
        for (BeanCoffee beanCoffee1 : beanCoffee.getBeanCoffees()) {
            BeanCoffee beanCoffee3 = new BeanCoffee(beanCoffee1.getFoodProductType(), beanCoffee1.getFoodProductBrand(),beanCoffee1.getFoodProductVolume(), beanCoffee1.getFoodProductWeight(), beanCoffee1.getFoodProductPrice(), beanCoffee1.getFoodProductQuantity());
            temporaryResidualBeanCoffees.add(beanCoffee3);
        }
        BeanCoffee beanCoffee4 = new BeanCoffee();
        BeanCoffee beanCoffee5 = new BeanCoffee();
        beanCoffee4 = temporaryResidualBeanCoffees.get(0);
        beanCoffee4.setFoodProductWeight(10000);
        beanCoffee5 = (beanCoffee.getBeanCoffees()).get(0);



        temporaryResidualBeanCoffees.addAll(beanCoffee.getBeanCoffees());

       // printBeanCoffeeTable(temporaryResidualBeanCoffees);
        int beanCoffeeCollectionMenuItemSelection = menuUtil.getFoodProductCollectionMenuItemSelection(beanCoffee.getFoodProductType(), temporaryResidualBeanCoffees.size());
   if (beanCoffeeCollectionMenuItemSelection != 0) {
            menuUtil.selectFoodProductQuantity();
            temporaryСollectionBeanCoffees.add(temporaryResidualBeanCoffees.get(beanCoffeeCollectionMenuItemSelection));
            BeanCoffee beanCoffee3 = new BeanCoffee();
           /*  beanCoffee1 =
           switch (beanCoffeeCollectionMenuItemSelection) {
                case 1: {

                    selectBeanCoffees();
                    while (!workInCoffeeCollectionMenu()) {
                    }

                }
                case 2: {
                    while (!workInTeaCollectionMenu()) {
                    }

                }
                case 3: {
                    while (!workInWaterCollectionMenu()) {
                    }

                }


            }*/
            returningInCoffeeCollectionMenu = false;
        } else {
            returningInCoffeeCollectionMenu = true;
        }
        return returningInCoffeeCollectionMenu;
    }

    private boolean workInTeaCollectionMenu() {
        screenUtils.printString("Sorry, but this section is not available yet.");
        return true;
    }

    private boolean workInWaterCollectionMenu() {
        screenUtils.printString("Sorry, but this section is not available yet.");
        return true;
    }

    private boolean workInWaterMenu() {
        screenUtils.printString("Sorry, but this section is not available yet.");
        return true;
    }

    private boolean workInTeaMenu() {
        screenUtils.printString("Sorry, but this section is not available yet.");
        return true;
    }

    private boolean workInCoffeeMenu() {
        boolean returningInWarehouseMenu;
        int CoffeeMenuItemSelection = menuUtil.getCoffeeMenuItemSelection();
        if (CoffeeMenuItemSelection != 7) {
            switch (CoffeeMenuItemSelection) {
                case 1: {
                    showBeanCoffees();
                    break;
                }
                case 2: {
                    showGroundCoffees();
                    break;
                }
                case 3: {
                    showInstantBagsCoffees();
                    break;
                }
                case 4: {
                    showInstantCansCoffees();
                    break;
                }
                case 5: {
                    showCoffees();
                    break;
                }
                case 6: {
                    while (!addCoffee()) {
                    }
                    break;
                }
            }
            returningInWarehouseMenu = false;
        } else {
            returningInWarehouseMenu = true;
        }
        return returningInWarehouseMenu;
    }

    private boolean addCoffee() {
        boolean returningInCoffeeMenu;
        int CoffeeAddingMenuItemSelection = menuUtil.getCoffeeAddingMenuItemSelection();
        if (CoffeeAddingMenuItemSelection != 5) {
            switch (CoffeeAddingMenuItemSelection) {
                case 1: {
                    beanCoffee.addFoodProduct("Bean coffee", menuUtil.addNewFoodProductBrand("Bean coffee"),
                            menuUtil.addNewCoffeeVolume("Bean coffee"), menuUtil.addNewFoodProductWeight("Bean coffee"),
                            menuUtil.addNewCoffeePrice("Bean coffee"), menuUtil.addNewCoffeeQuantity("Bean coffee"));
                    screenUtils.printString("New position of a bean coffee had added successfully");
                    break;
                }
                case 2: {
                    groundCoffee.addFoodProduct("Ground coffee", menuUtil.addNewFoodProductBrand("Ground coffee"),
                            menuUtil.addNewCoffeeVolume("Ground coffee"), menuUtil.addNewFoodProductWeight("Ground coffee"),
                            menuUtil.addNewCoffeePrice("Ground coffee"), menuUtil.addNewCoffeeQuantity("Ground coffee"));
                    screenUtils.printString("New position of a ground coffee had added successfully");
                    break;
                }
                case 3: {
                    instantBagsCoffee.addFoodProduct("Instant bags coffee", menuUtil.addNewFoodProductBrand("Instant bags coffee"),
                            menuUtil.addNewCoffeeVolume("Instant bags coffee"), menuUtil.addNewFoodProductWeight("Instant bags coffee"),
                            menuUtil.addNewCoffeePrice("Instant bags coffee"), menuUtil.addNewCoffeeQuantity("Instant bags coffee"));
                    screenUtils.printString("New position of a instant bags coffee had added successfully");
                    break;
                }
                case 4: {
                    instantCansCoffee.addFoodProduct("Instant cans coffee", menuUtil.addNewFoodProductBrand("Instant cans coffee"),
                            menuUtil.addNewCoffeeVolume("Instant cans coffee"), menuUtil.addNewFoodProductWeight("Instant cans coffee"),
                            menuUtil.addNewCoffeePrice("Instant cans coffee"), menuUtil.addNewCoffeeQuantity("Instant cans coffee"));
                    screenUtils.printString("New position of a instant cans coffee had added successfully");
                    break;
                }
            }
            returningInCoffeeMenu = false;
        } else {
            returningInCoffeeMenu = true;
        }
        return returningInCoffeeMenu;
    }

    private void showBeanCoffees() {
       // printBeanCoffeeTable();
        while (!workInBeanCoffeeSortingMenu()) {
        }
    }

    private void printBeanCoffeeTable(ArrayList<BeanCoffee> beanCoffees) {
        int item = 1;
        screenUtils.printFoodProductTableHeader();
        for (BeanCoffee beanCoffee : beanCoffees) {
            screenUtils.printFoodProduct(item, beanCoffee.getFoodProductType(), beanCoffee.getFoodProductBrand(), beanCoffee.getFoodProductQuantity(),
                    beanCoffee.getFoodProductPrice(), beanCoffee.getFoodProductWeight(), beanCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private boolean workInBeanCoffeeSortingMenu() {
        boolean returningInBeanCoffeeMenu;
        int sortingBeanCoffeeMenuItemSelection = menuUtil.getSortCoffeeMenuSelection("bean coffee");
        if (sortingBeanCoffeeMenuItemSelection != 3) {
            switch (sortingBeanCoffeeMenuItemSelection) {
                case 1: {
                    showSortBeanCoffeesByPrice();
                    break;
                }
                case 2: {
                    showSortBeanCoffeesByWeight();
                    break;
                }
            }
            returningInBeanCoffeeMenu = false;
        } else {
            returningInBeanCoffeeMenu = true;
        }
        return returningInBeanCoffeeMenu;
    }

    private void showSortBeanCoffeesByPrice() {
        int item = 1;
        beanCoffees = beanCoffee.getBeanCoffees();
        Collections.sort(beanCoffees);
        screenUtils.printFoodProductTableHeader();
        for (BeanCoffee beanCoffee : beanCoffees) {
            screenUtils.printFoodProduct(item, beanCoffee.getFoodProductType(), beanCoffee.getFoodProductBrand(), beanCoffee.getFoodProductQuantity(),
                    beanCoffee.getFoodProductPrice(), beanCoffee.getFoodProductWeight(), beanCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showSortBeanCoffeesByWeight() {
        int item = 1;
        beanCoffees = beanCoffee.getBeanCoffees();
        Collections.sort(beanCoffees, new BeanCoffee());
        screenUtils.printFoodProductTableHeader();
        for (BeanCoffee beanCoffee : beanCoffees) {
            screenUtils.printFoodProduct(item, beanCoffee.getFoodProductType(), beanCoffee.getFoodProductBrand(), beanCoffee.getFoodProductQuantity(),
                    beanCoffee.getFoodProductPrice(), beanCoffee.getFoodProductWeight(), beanCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showGroundCoffees() {
        int item = 1;
        groundCoffees = groundCoffee.getGroundCoffees();
        screenUtils.printFoodProductTableHeader();
        for (GroundCoffee groundCoffee : groundCoffees) {
            screenUtils.printFoodProduct(item, groundCoffee.getFoodProductType(), groundCoffee.getFoodProductBrand(), groundCoffee.getFoodProductQuantity(),
                    groundCoffee.getFoodProductPrice(), groundCoffee.getFoodProductWeight(), groundCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
        while (!workInGroundCoffeeSortingMenu()) {
        }
    }

    private boolean workInGroundCoffeeSortingMenu() {
        boolean returningInGroundCoffeeMenu;
        int sortingGroundCoffeeMenuItemSelection = menuUtil.getSortCoffeeMenuSelection("ground coffee");
        if (sortingGroundCoffeeMenuItemSelection != 3) {
            switch (sortingGroundCoffeeMenuItemSelection) {
                case 1: {
                    showSortGroundCoffeesByPrice();
                    break;
                }
                case 2: {
                    showSortGroundCoffeesByWeight();
                    break;
                }
            }
            returningInGroundCoffeeMenu = false;
        } else {
            returningInGroundCoffeeMenu = true;
        }
        return returningInGroundCoffeeMenu;
    }

    private void showSortGroundCoffeesByPrice() {
        int item = 1;
        groundCoffees = groundCoffee.getGroundCoffees();
        Collections.sort(groundCoffees);
        screenUtils.printFoodProductTableHeader();
        for (GroundCoffee groundCoffee : groundCoffees) {
            screenUtils.printFoodProduct(item, groundCoffee.getFoodProductType(), groundCoffee.getFoodProductBrand(), groundCoffee.getFoodProductQuantity(),
                    groundCoffee.getFoodProductPrice(), groundCoffee.getFoodProductWeight(), groundCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showSortGroundCoffeesByWeight() {
        int item = 1;
        groundCoffees = groundCoffee.getGroundCoffees();
        Collections.sort(groundCoffees, new GroundCoffee());
        screenUtils.printFoodProductTableHeader();
        for (GroundCoffee groundCoffee : groundCoffees) {
            screenUtils.printFoodProduct(item, groundCoffee.getFoodProductType(), groundCoffee.getFoodProductBrand(), groundCoffee.getFoodProductQuantity(),
                    groundCoffee.getFoodProductPrice(), groundCoffee.getFoodProductWeight(), groundCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showInstantBagsCoffees() {
        int item = 1;
        instantBagsCoffees = instantBagsCoffee.getInstantBagsCoffees();
        screenUtils.printFoodProductTableHeader();
        for (InstantBagsCoffee instantBagsCoffee : instantBagsCoffees) {
            screenUtils.printFoodProduct(item, instantBagsCoffee.getFoodProductType(), instantBagsCoffee.getFoodProductBrand(), instantBagsCoffee.getFoodProductQuantity(),
                    instantBagsCoffee.getFoodProductPrice(), instantBagsCoffee.getFoodProductWeight(), instantBagsCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
        while (!workInInstantBagsCoffeeSortingMenu()) {
        }
    }

    private boolean workInInstantBagsCoffeeSortingMenu() {
        boolean returningInInstantBagsCoffeeMenu;
        int sortingInstantBagsCoffeeMenuItemSelection = menuUtil.getSortCoffeeMenuSelection("instant bags coffee");
        if (sortingInstantBagsCoffeeMenuItemSelection != 3) {
            switch (sortingInstantBagsCoffeeMenuItemSelection) {
                case 1: {
                    showSortInstantBagsCoffeesByPrice();
                    break;
                }
                case 2: {
                    showSortInstantBagsCoffeesByWeight();
                    break;
                }
            }
            returningInInstantBagsCoffeeMenu = false;
        } else {
            returningInInstantBagsCoffeeMenu = true;
        }
        return returningInInstantBagsCoffeeMenu;
    }

    private void showSortInstantBagsCoffeesByPrice() {
        int item = 1;
        instantBagsCoffees = instantBagsCoffee.getInstantBagsCoffees();
        Collections.sort(instantBagsCoffees);
        screenUtils.printFoodProductTableHeader();
        for (InstantBagsCoffee instantBagsCoffee : instantBagsCoffees) {
            screenUtils.printFoodProduct(item, instantBagsCoffee.getFoodProductType(), instantBagsCoffee.getFoodProductBrand(), instantBagsCoffee.getFoodProductQuantity(),
                    instantBagsCoffee.getFoodProductPrice(), instantBagsCoffee.getFoodProductWeight(), instantBagsCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showSortInstantBagsCoffeesByWeight() {
        int item = 1;
        instantBagsCoffees = instantBagsCoffee.getInstantBagsCoffees();
        Collections.sort(instantBagsCoffees, new InstantBagsCoffee());
        screenUtils.printFoodProductTableHeader();
        for (InstantBagsCoffee instantBagsCoffee : instantBagsCoffees) {
            screenUtils.printFoodProduct(item, instantBagsCoffee.getFoodProductType(), instantBagsCoffee.getFoodProductBrand(), instantBagsCoffee.getFoodProductQuantity(),
                    instantBagsCoffee.getFoodProductPrice(), instantBagsCoffee.getFoodProductWeight(), instantBagsCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showInstantCansCoffees() {
        int item = 1;
        instantCansCoffees = instantCansCoffee.getInstantCansCoffees();
        screenUtils.printFoodProductTableHeader();
        for (InstantCansCoffee instantCansCoffee : instantCansCoffees) {
            screenUtils.printFoodProduct(item, instantCansCoffee.getFoodProductType(), instantCansCoffee.getFoodProductBrand(), instantCansCoffee.getFoodProductQuantity(),
                    instantCansCoffee.getFoodProductPrice(), instantCansCoffee.getFoodProductWeight(), instantCansCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
        while (!workInInstantCansCoffeeSortingMenu()) {
        }
    }

    private boolean workInInstantCansCoffeeSortingMenu() {
        boolean returningInInstantCansCoffeeMenu;
        int sortingInstantCansCoffeeMenuItemSelection = menuUtil.getSortCoffeeMenuSelection("instant cans coffee");
        if (sortingInstantCansCoffeeMenuItemSelection != 3) {
            switch (sortingInstantCansCoffeeMenuItemSelection) {
                case 1: {
                    showSortInstantCansCoffeesByPrice();
                    break;
                }
                case 2: {
                    showSortInstantCansCoffeesByWeight();
                    break;
                }
            }
            returningInInstantCansCoffeeMenu = false;
        } else {
            returningInInstantCansCoffeeMenu = true;
        }
        return returningInInstantCansCoffeeMenu;
    }

    private void showSortInstantCansCoffeesByPrice() {
        int item = 1;
        instantCansCoffees = instantCansCoffee.getInstantCansCoffees();
        Collections.sort(instantCansCoffees);
        screenUtils.printFoodProductTableHeader();
        for (InstantCansCoffee instantCansCoffee : instantCansCoffees) {
            screenUtils.printFoodProduct(item, instantCansCoffee.getFoodProductType(), instantCansCoffee.getFoodProductBrand(), instantCansCoffee.getFoodProductQuantity(),
                    instantCansCoffee.getFoodProductPrice(), instantCansCoffee.getFoodProductWeight(), instantCansCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showSortInstantCansCoffeesByWeight() {
        int item = 1;
        instantCansCoffees = instantCansCoffee.getInstantCansCoffees();
        Collections.sort(instantCansCoffees, new InstantCansCoffee());
        screenUtils.printFoodProductTableHeader();
        for (InstantCansCoffee instantCansCoffee : instantCansCoffees) {
            screenUtils.printFoodProduct(item, instantCansCoffee.getFoodProductType(), instantCansCoffee.getFoodProductBrand(), instantCansCoffee.getFoodProductQuantity(),
                    instantCansCoffee.getFoodProductPrice(), instantCansCoffee.getFoodProductWeight(), instantCansCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }

    private void showCoffees() {
        int item = 1;
        beanCoffees = beanCoffee.getBeanCoffees();
        screenUtils.printFoodProductTableHeader();
        for (BeanCoffee beanCoffee : beanCoffees) {
            screenUtils.printFoodProduct(item, beanCoffee.getFoodProductType(), beanCoffee.getFoodProductBrand(), beanCoffee.getFoodProductQuantity(),
                    beanCoffee.getFoodProductPrice(), beanCoffee.getFoodProductWeight(), beanCoffee.getFoodProductVolume());
            item++;
        }
        groundCoffees = groundCoffee.getGroundCoffees();
        for (GroundCoffee groundCoffee : groundCoffees) {
            screenUtils.printFoodProduct(item, groundCoffee.getFoodProductType(), groundCoffee.getFoodProductBrand(), groundCoffee.getFoodProductQuantity(),
                    groundCoffee.getFoodProductPrice(), groundCoffee.getFoodProductWeight(), groundCoffee.getFoodProductVolume());
            item++;
        }
        instantBagsCoffees = instantBagsCoffee.getInstantBagsCoffees();
        for (InstantBagsCoffee instantBagsCoffee : instantBagsCoffees) {
            screenUtils.printFoodProduct(item, instantBagsCoffee.getFoodProductType(), instantBagsCoffee.getFoodProductBrand(), instantBagsCoffee.getFoodProductQuantity(),
                    instantBagsCoffee.getFoodProductPrice(), instantBagsCoffee.getFoodProductWeight(), instantBagsCoffee.getFoodProductVolume());
            item++;
        }
        instantCansCoffees = instantCansCoffee.getInstantCansCoffees();
        for (InstantCansCoffee instantCansCoffee : instantCansCoffees) {
            screenUtils.printFoodProduct(item, instantCansCoffee.getFoodProductType(), instantCansCoffee.getFoodProductBrand(), instantCansCoffee.getFoodProductQuantity(),
                    instantCansCoffee.getFoodProductPrice(), instantCansCoffee.getFoodProductWeight(), instantCansCoffee.getFoodProductVolume());
            item++;
        }
        screenUtils.printFoodProductTableBottom(FOODPRODUCT_TABLE_WIDTH);
    }
}
