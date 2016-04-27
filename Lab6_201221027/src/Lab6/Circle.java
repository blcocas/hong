package Lab6;

public class Circle {

	double radius, Area2, Perimeter2;
	
	public Circle(double radius){
		
	}
	
	public double getRadius(){
		
		return radius;
	}
	
	public void setRadius(double radius){
		
	}
	
	public double CalculateArea(){
		
		Area2 = radius*radius*Math.PI;
		
		return Area2;
	}
	
	public double calculatePerimeter(){
		
		Perimeter2= 2*Math.PI*radius;
		
		return Perimeter2;
	}
	
	public void printinf(){
		
	}
}
