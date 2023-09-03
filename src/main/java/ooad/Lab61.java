
package ooad;
public class Lab61 {
    public static void main(String[] args) {
        // Creating objects of the concrete class
        Circle circle = new Circle(5.0);

        // Calling the calculateArea method on the object
        double area = circle.calculateArea();
        System.out.println("Circle Area: " + area);
    }
}
