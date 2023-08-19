package instruments;

import behaviours.IPlay;
import item.Item;

public abstract class Instrument extends Item {

    private InstrumentType instrumentType;

    public Instrument(String name, String description, double costPrice, double salePrice, InstrumentType instrumentType) {
        super(name, description, costPrice, salePrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

}
