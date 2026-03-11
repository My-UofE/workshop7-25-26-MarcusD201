/*
 * Another test driver for the Cylinder class.
 */
public class TestCylinder2 {
    public static void main(String[] args) {
       Circle cy2 = new Cylinder(5.0, 2.0);

       double r = cy2.getRadius();
       double a = cy2.getArea();
       double h = ((Cylinder)cy2).getHeight();
       double v = ((Cylinder)cy2).getVolume();

       System.out.printf("Height: %.2f, Radius: %.2f, Area: %.2f, Volume: %.2f\n", h, r, a, v);

    }
}