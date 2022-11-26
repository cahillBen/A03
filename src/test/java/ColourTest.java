import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

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
        int[] array = new int[] {0b11111111, 0b11111111, 0b11111111};
        Colour white = new Colour(array);
        assertEquals(255, white.r, 0.0);
        assertEquals(255, white.g, 0.0);
        assertEquals(255, white.b, 0.0);
    }

    @Test
    public void colourEquals(){
        Colour red1 = new Colour(1.0, 0.0, 0.0);
        Colour red2 = new Colour(1.0, 0.0, 0.0);
        assertTrue(red1.equals(red2));
    }
}
