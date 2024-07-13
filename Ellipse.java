public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double computePerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2.0);
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }
    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
}
}

