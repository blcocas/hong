package Lab6;

public class Circle extends Shape {

   double radius, Area2, Perimeter2;
   //Circle print = new Circle(radius);
   
   public Circle(double radius){
      this.radius = radius;
   }
   
   
   public double CalculateArea(){
      
      Area2 = radius*radius*Math.PI;
      
      return Area2;
   }
   
   public double CalculatePerimeter(){
      
      Perimeter2= 2*Math.PI*radius;
      
      return Perimeter2;
   }
   
   public void printInfo(){
      Circle print = new Circle(radius);
      System.out.println("Circle with an id of "+this.getId()+" radius of "+radius+"area of "+print.CalculateArea()+"and "+"perimeter of "+print.CalculatePerimeter());
   
   }
}