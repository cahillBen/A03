import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColourTest {
    @Test
    public void colourRedParameterTest(){
        Colour red = new Colour(1.0, 0.5, 0.0);
        assertEquals(red.r, 1.0);
    }
}
