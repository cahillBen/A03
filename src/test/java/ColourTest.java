import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ColourTest {
    @Test
    public void colourRedParameterTest(){
        Colour red = new Colour(1.0, 0.5, 0.0);
        assertEquals(red.getR(), 255, 0.0);
    }

    @Test
    public void colourGreenParameterTest(){
        Colour green = new Colour(0.0, 1.0, 0.0);
        assertEquals(green.getG(), 255, 0.0);
    }

    @Test
    public void colourBlueParameterTest(){
        Colour blue = new Colour(0.0, 0.0, 1.0);
        assertEquals(blue.getB(), 255, 0.0);
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
        assertEquals(255, white.getR(), 0.0);
        assertEquals(255, white.getG(), 0.0);
        assertEquals(255, white.getB(), 0.0);
    }

    @Test
    public void colourEquals(){
        Colour red1 = new Colour(1.0, 0.0, 0.0);
        int[] array = new int[] {0b11111111, 0b00000000, 0b00000000};
        Colour red2 = new Colour(array);
        boolean ans = red1.equals(red2);
        assertTrue(ans);
    }
}
