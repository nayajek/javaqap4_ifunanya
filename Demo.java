public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(5, 3);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(4);

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        scaleShapes(shapes, 2);
        System.out.println("After scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
    public static void scaleShapes(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            shape.scale(factor);
        }
    }
}



    

