package Lab6;

public class ShapeTest {
   Shape [] shapes = new Shape[3];
   public ShapeTest() {
      
      
      shapes [0] = new Rectangle(4,5);
      shapes [1] = new Triangle(1,2,3);
      shapes [2] = new Circle(1);
      shapes [0].setId(1);
      shapes [1].setId(2);
      shapes [2].setId(3);
      
   }
   public static void main(String[] args) {
      ShapeTest test = new ShapeTest();
      test.processShape(test.shapes[0]);
      test.processShape(test.shapes[1]);
      test.processShape(test.shapes[2]);
      
   }
   
   public void processShape(Shape input_shape) {
      
      input_shape.printInfo();
      
      if(input_shape instanceof Rectangle)
         ((Rectangle) input_shape).drawRectangle();
   }

}