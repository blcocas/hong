package Lab6;

public class Triangle extends Shape {

	double side1;
	double side2;
	double side3;
	double Area, Perimeter,sum;
	
	public Triangle(double side1, double side2, double side3){
		
		
	}
	
	public double getSide1(){
		return side1;
	}
	public void SetSide1(double side1){
		
	}
	public double getSide2(){
		return side2;
	}
	
	public void SetSide2(double side2){
		
	}
	
	public double getSide3(){
		return side3;
	}
	
	public void SetSide3(double side3){
		
	}
	
	public double CalculateArea(){
		
		sum = side1 +side2+ side3;
		
		Area =Math.sqrt(sum * (sum-side1) * (sum-side2) * (sum-side3));
				
		return Area;
	}
	
	public double CalculatePerimeter(){
		
		Perimeter= side1+ side2+ side3;
		
		return Perimeter;
	}
	
	public void printInfo(){
		Triangle print = new Triangle(side1,side2,side3);
		System.out.println("Triangle with an id of "+print.getId()+"sides of "+side1+", "+side2+"and "+side3+", area of "+print.CalculateArea()+"and "+"perimeter of "+print.CalculatePerimeter());
		
	}
	
}
