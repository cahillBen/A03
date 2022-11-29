public class Colour {
    // RGB values of colour
    // represented as values 0 to 255
    private final double r, g, b;

    /**
     * Constructor taking 3 values representing
     * amount of r, g and b in the colour
     * Must be values between 0 and 1
     * each converted to a value 0 to 255
     *
     * @param r amount of red in the colour
     * @param g amount of green in the colour
     * @param b amount of blue in the colour
     */
    public Colour(double r, double g, double b){
        if (r < 0 || r > 1) {
            throw new IllegalArgumentException("'r' input is out of range");
        }
        if (g < 0 || g > 1) {
            throw new IllegalArgumentException("'g' input is out of range");
        }
        if (b < 0 || b > 1) {
            throw new IllegalArgumentException("'b' input is out of range");
        }
        this.r = r * 255;
        this.g = g * 255;
        this.b = b * 255;
    }

    /**
     * single binary input constructor
     * takes a list of 3 bytes and converts these to RGB values
     *
     * @param rgb list with 3 binary inputs
     */
    public Colour(int[] rgb){
        this.r = rgb[0];
        this.g = rgb[1];
        this.b = rgb[2];
    }

    /**
     * Compare Colour object with another object
     * True if 'o' is a Colour object with the same RGB values
     *
     * @param o     Any object to be compared
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return Double.compare(colour.r, r) == 0 && Double.compare(colour.g, g) == 0 && Double.compare(colour.b, b) == 0;
    }

    /**
     * Getter for 'r' value
     *
     * @return  r     The colour’s r value.
     */
    public double getR() {
        return r;
    }

    /**
     * Getter for 'g' value
     *
     * @return  g     The colour’s g value.
     */
    public double getG() {
        return g;
    }

    /**
     * Getter for 'b' value
     *
     * @return  b     The colour’s b value.
     */
    public double getB() {
        return b;
    }


}
