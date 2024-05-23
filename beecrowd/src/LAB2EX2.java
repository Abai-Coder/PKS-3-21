public class LAB2EX2 {
    private double radius;
    private static int numberOfObjects = 0;

    public LAB2EX2(double radius) {
        setRadius(radius);
        numberOfObjects++;
        System.out.println("Number of objects created: " + numberOfObjects);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public static void main(String[] args) {
        try {
            LAB2EX2 c1 = new LAB2EX2(5);
            LAB2EX2 c2 = new LAB2EX2(-1); // This will throw an exception
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}
