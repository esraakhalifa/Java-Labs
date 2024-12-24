import java.util.ArrayList;
import java.util.List;
import lab6.*;
public class Main
{
    public static void main(String args[]) {
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Rectangle());
    shapes.add(new Rectangle());
    shapes.add(new Circle());
    shapes.add(new Circle());
    Test test = new Test();
    test.drawShapes(shapes);

    /*
    List<String> list = new ArrayList<>();

// Adding elements to the List
list.add("Mango");
list.add("Apple");
list.add("Banana");
list.add("Grapes");

// Displaying the List
System.out.println("List elements: " + list);
     */
}
}