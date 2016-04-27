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
	
	}
}
