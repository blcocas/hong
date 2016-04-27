package Lab6;

public class ShapeTest {
   
   public ShapeTest() {
   }
   
   public void start(){
	   Shape [] shapes = new Shape[3];
	      shapes [0] = new Rectangle(4,5);
	      shapes [1] = new Triangle(1,2,3);
	      shapes [2] = new Circle(1);
	      shapes [0].setId(1);
	      shapes [1].setId(2);
	      shapes [2].setId(3);
	      processShape(shapes[0]);
	      processShape(shapes[1]);
	      processShape(shapes[2]);
   }
   public static void main(String[] args) {
      ShapeTest test = new ShapeTest();
      test.start();
   }
   
   public void processShape(Shape input_shape) {
      
      input_shape.printInfo();
      
      if(input_shape instanceof Rectangle)
         ((Rectangle) input_shape).drawRectangle();
   }

}