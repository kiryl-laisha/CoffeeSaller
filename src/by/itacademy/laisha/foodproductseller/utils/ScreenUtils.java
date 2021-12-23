package by.itacademy.laisha.foodproductseller.utils;

public class ScreenUtils {

    public ScreenUtils() {
    }

    public static void printString(String string) {
        System.out.println(string);
    }

    public static void printFramedString(String string) {
        System.out.println("-".repeat(200));
        System.out.println(string);
        System.out.println("-".repeat(200));
    }

    public static void printVehicle(int item, String vehicleBrand, String vehicleModel, String vehicleRegisterSign, double vehicleVolume) {
        System.out.printf(" |% -3d|  %-13s|  %-13s|  %-17s|   %-9.1f|\n", item, vehicleBrand, vehicleModel, vehicleRegisterSign, vehicleVolume);
    }

    public static void printStrip() {
        System.out.println("-".repeat(200));
    }

    public void printVehicleTableHeader() {
        System.out.println(" " + "-".repeat(70));
        System.out.println(" | # |     Brand     |     Model     |   Register sign   | Volume, m3 |");
        System.out.println(" " + "-".repeat(70));
    }

    public void printFoodProductTableHeader() {
        System.out.println(" " + "-".repeat(119));
        System.out.println(" | # |            Type            |             Brand           |  Quantity, | Price, |    Cost,  |  Weight,|  Volume, |");
        System.out.println(" |   |                            |                             |   things   |   $    |      $    |   gram  |     m3   |");
        System.out.println(" " + "-".repeat(119));
    }

    public void printFoodProduct(int item, String foodProductType, String foodProductBrand, int foodProductQuantity,
                                 double foodProductPrice, double foodProductWeight, double foodProductVolume) {
        System.out.printf(" |% -3d|      %-22s|  %-27s|   %-9d| %-7.2f| %-10.2f|  %-7.1f| %-9.6f|\n", item, foodProductType, foodProductBrand,
                foodProductQuantity, foodProductPrice, foodProductQuantity * foodProductPrice, foodProductWeight, foodProductVolume);
    }

    public void printFoodProductTableBottom(int tableWidth) {
        System.out.println(" " + "-".repeat(tableWidth));
    }
}
