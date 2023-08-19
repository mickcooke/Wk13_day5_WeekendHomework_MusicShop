package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int stringNumber;

    public Guitar(String name, String description, double costPrice, double salePrice, InstrumentType instrumentType, int stringNumber) {
        super(name, description, costPrice, salePrice, instrumentType);
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public String play(){
        return "twang!";
    }
}
