package Lab6;

public abstract class Shape {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract double CalculateArea();
		
	public abstract double CalculatePerimeter();

	public abstract void printInfo();
}
