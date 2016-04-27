package Lab6;

public class ShapeTest {

	public void start() {
		
		Shape [] shapes = new Shape[3];
		shapes [0] = new Rectangle(1,2);
		shapes [1] = new Triangle(1,2,3);
		shapes [2] = new Circle(1);
		
		
	}
	public static void main(String[] args) {
		
		
	}
	
	public void processShape(Shape input_shape) {
		
		input_shape.printInfo();
		
		if(input_shape instanceof Rectangle)
			((Rectangle) input_shape).drawRectangle();
	}

}
