import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ColourTest {
    @Test
    public void colourRedParameterTest(){
        Colour red = new Colour(1.0, 0.5, 0.0);
        assertEquals(red.r, 255, 0.0);
    }

    @Test
    public void colourGreenParameterTest(){
        Colour green = new Colour(0.0, 1.0, 0.0);
        assertEquals(green.g, 255, 0.0);
    }

    @Test
    public void colourBlueParameterTest(){
        Colour blue = new Colour(0.0, 0.0, 1.0);
        assertEquals(blue.b, 255, 0.0);
    }

    @Test
    public void colourRedParameterInRange(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(1.5, 0.0, 0.0));
    }

    @Test
    public void colourGreenParameterInRange(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(0.0, 2.0, 0.0));
    }

    @Test
    public void colourBlueParameterInRange(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(0.0, 0.0, 100.0));
    }

    @Test
    public void colourBinaryParameter(){
        Colour white = new Colour([0b11111111, 0b11111111, 0b11111111]);
        assertEquals(white.r, 255, 0.0);
        assertEquals(white.g, 255, 0.0);
        assertEquals(white.b, 255, 0.0);
    }
}
