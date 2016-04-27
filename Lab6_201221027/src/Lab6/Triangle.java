package Lab6;

public class Triangle extends Shape {

   double side1;
   double side2;
   double side3;
   double Area, Perimeter,sum;
   
   public Triangle(double side1, double side2, double side3){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      
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
      System.out.println("Triangle with an id of "+this.getId()+"sides of "+side1+", "+side2+"and "+side3+", area of "+print.CalculateArea()+"and "+"perimeter of "+print.CalculatePerimeter());
      
   }
   
}