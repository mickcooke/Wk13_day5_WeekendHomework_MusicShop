package accessories;

import item.Item;

public abstract class Accessory extends Item {

    public Accessory(String name, String description, double costPrice, double salePrice) {
        super(name, description, costPrice, salePrice);
    }
}
