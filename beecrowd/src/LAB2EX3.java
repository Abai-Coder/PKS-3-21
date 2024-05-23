// Custom Exception Class
class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Circle Class
public class LAB2EX3 {
    private double radius;
    private static int numberOfObjects = 0;

    public LAB2EX3(double radius) throws InvalidRadiusException {
        setRadius(radius);
        numberOfObjects++;
        System.out.println("Number of objects created: " + numberOfObjects);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius < 0) {
            throw new InvalidRadiusException(radius);
        }
        this.radius = radius;
    }

    public static void main(String[] args) {
        try {
            LAB2EX3 c1 = new LAB2EX3(5);
            LAB2EX3 c2 = new LAB2EX3(-5); // This will throw an exception
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
    }
}
