//lab 6
package ooad;

public interface Lab6 {
    double PI = 3.14159265; // Public static final member

    // Public and abstract method
    double calculateArea();
}

// Concrete class Circle implementing the Shape interface
class Circle implements Lab6 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}
