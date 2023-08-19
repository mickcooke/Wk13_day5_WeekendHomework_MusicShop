package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int keyNumber;
    public Piano(String name, String description, double costPrice, double salePrice, InstrumentType instrumentType, int keyNumber) {
        super(name, description, costPrice, salePrice, instrumentType);
        this.keyNumber = keyNumber;
    }


    public int getKeyNumber() {
        return keyNumber;
    }

    public String play(){
        return "plink plonk";
    }
}
