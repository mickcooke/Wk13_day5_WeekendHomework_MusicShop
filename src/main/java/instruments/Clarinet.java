package instruments;

import behaviours.IPlay;

public class Clarinet extends Instrument implements IPlay {

    private String woodType;

    public Clarinet(String name, String description, double costPrice, double salePrice, InstrumentType instrumentType, String woodType) {
        super(name, description, costPrice, salePrice, instrumentType);
        this.woodType = woodType;
    }


    public String getWoodType() {
        return woodType;
    }

    public String play(){
        return "boop!";
    }
}
