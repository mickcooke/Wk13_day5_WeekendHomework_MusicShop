package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {


    Piano piano;
    @Before
    public void before(){
        piano = new Piano("Bosendorfer", "A beautiful piano", 7000.00, 10000.00, InstrumentType.KEYBOARD, 88);
    }

    @Test
    public void hasName(){
        assertEquals("Bosendorfer", piano.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("A beautiful piano", piano.getDescription());
    }

    @Test
    public void hasType(){
        assertEquals("Keyboard", piano.getInstrumentType().getType());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(7000.00, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(10000.00, piano.getSalePrice(), 0.01);
    }

    @Test
    public void hasKeyNumber(){
        assertEquals(88, piano.getKeyNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plonk", piano.play());
    }




}
