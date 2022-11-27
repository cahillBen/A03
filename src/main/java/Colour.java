public class Colour {

    double r;
    double g;
    double b;
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

    public Colour(int[] rgb){
        this.r = rgb[0];
        this.g = rgb[1];
        this.b = rgb[2];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return Double.compare(colour.r, r) == 0 && Double.compare(colour.g, g) == 0 && Double.compare(colour.b, b) == 0;
    }
}
