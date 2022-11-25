import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColourTest {
    @Test
    public void colourRedParameterTest(){
        Colour red = new Colour(1.0, 0.5, 0.0);
        assertEquals(red.r, 1.0, 0.0);
    }

    @Test
    public void colourGreenParameterTest(){
        Colour green = new Colour(0.0, 0.5, 0.0);
        assertEquals(green.g, 0.5, 0.0);
    }
}
