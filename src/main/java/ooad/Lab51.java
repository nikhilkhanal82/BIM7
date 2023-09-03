
package ooad;


public class Lab51 {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Lab5.Circle circle = new Lab5.Circle(5.0);
        Lab5.Rectangle rectangle = new Lab5.Rectangle(4.0, 6.0);

        // Calling the displayArea method on objects of concrete subclasses
        circle.displayArea();
        rectangle.displayArea();
    }
}
    
