//lab 5
package ooad;

public abstract class Lab5 {
    // Abstract method that must be implemented by subclasses
    public abstract double calculateArea();
    
    // Concrete method
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
    
    // Concrete subclass Circle
    public static class Circle extends Lab5 {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Concrete subclass Rectangle
    public static class Rectangle extends Lab5 {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }
}
