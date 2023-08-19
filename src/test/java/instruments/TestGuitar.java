package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender Stratocaster", "Red and white, three single coil pickups", 350.00, 560.00, InstrumentType.STRINGS, 6);
    }

    @Test
    public void hasStringNumber(){
        assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("twang!", guitar.play());
    }
}
