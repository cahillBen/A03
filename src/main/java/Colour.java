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
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
