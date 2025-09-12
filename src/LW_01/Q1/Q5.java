import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double computeArea() {
        return Math.PI * radius * radius;
    }
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter outer radius:");
        double outerRadius = scanner.nextDouble();

        System.out.println("Enter inner radius:");
        double innerRadius = scanner.nextDouble();
        Circle outerCircle = new Circle(outerRadius);
        Circle innerCircle = new Circle(innerRadius);
        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;
        System.out.println("Shaded area: " + shadedArea);
        double outerCircumference = outerCircle.computeCircumference();
        double innerCircumference = innerCircle.computeCircumference();
        System.out.println("Circumference of outer circle: " + outerCircumference);
        System.out.println("Circumference of inner circle: " + innerCircumference);

        scanner.close();
    }
}
