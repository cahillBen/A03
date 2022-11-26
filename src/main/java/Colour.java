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
        this.r = (int) rgb[0];
        this.g = (int) rgb[1];
        this.b = (int) rgb[2];
    }
}
