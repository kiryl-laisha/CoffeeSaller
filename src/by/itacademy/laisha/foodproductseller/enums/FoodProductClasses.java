package by.itacademy.laisha.foodproductseller.enums;

public enum FoodProductClasses {

    COFFEE, TEA, WATER;

    public String getProductClass() {

        String productClass;
        switch (this) {
            case COFFEE:
                productClass = "Coffee";
                break;
            case TEA:
                productClass = "Tea";
                break;
            case WATER:
                productClass = "Water";
                break;
            default:
                productClass = "Food product class hadn't been defined";
        }
        return productClass;
    }
}
