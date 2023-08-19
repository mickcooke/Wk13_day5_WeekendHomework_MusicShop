package item;

import behaviours.ISell;

public abstract class Item implements ISell {

    private String name;
    private String description;
    private double costPrice;
    private double salePrice;

    public Item(String name, String description, double costPrice, double salePrice) {
        this.name = name;
        this.description = description;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup() {
        return this.salePrice - this.costPrice;
    }
}
