package shop;

import accessories.GuitarStrings;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Fender Stratocaster", "Red and white, three single coil pickups", 350.00, 560.00, InstrumentType.STRINGS, 6);
        trumpet = new Trumpet("Getzen Capri", "wonderful tone", 300.00, 600.00, InstrumentType.BRASS, 3);
        guitarStrings = new GuitarStrings("Dadario electric", "6 long lasting electric guitar strings", 2.00, 8.99);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddStock(){
        shop.addToStock(guitar);
        shop.addToStock(trumpet);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canRemoveStock(){
        shop.addToStock(guitar);
        shop.addToStock(trumpet);
        shop.addToStock(guitarStrings);
        shop.removeFromStock(guitar);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canGetMarkup(){
        shop.addToStock(guitar);
        assertEquals(210.00, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addToStock(guitar);
        shop.addToStock(trumpet);
        shop.addToStock(guitarStrings);
        assertEquals(516.99, shop.getTotalPotentialProfit(), 0.01);

    }
}
