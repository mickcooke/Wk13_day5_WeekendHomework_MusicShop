package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int valveNumber;

    public Trumpet(String name, String description, double costPrice, double salePrice, InstrumentType instrumentType, int valveNumber) {
        super(name, description, costPrice, salePrice, instrumentType);
        this.valveNumber = valveNumber;
    }


    public int getValveNumber() {
        return valveNumber;
    }

    public String play(){
        return "root ta toot!";
    }
}
