package Lab6;

public class Rectangle extends Shape {

	double width;
	double height;
	
	public Rectangle (double input_width, double input_height){
		this. width = input_width;
		this. height = input_height;
		
	}
	
	public double CalculateArea() {
		return (this. width * this. height);
	}
	
	public double CalculatePerimeter() {
		return ((this. width + this. height)*2);
		
	}
	
	public void drawRectangle() {
		
	}
	
	public void printInfo() { 
		Rectangle print = new Rectangle(width,height);
		System.out.println("Retangle with an id of "+print.getId()+"width of "+width+", height of "+height+" ,area of "+print.CalculateArea()+"and "+"perimeter of "+print.CalculatePerimeter());
		
	}
}
