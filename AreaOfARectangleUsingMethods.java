
public class AreaOfARectangleUsingMethods {
	public static void main(String[] args) {
		
		AreaOfARectangleUsingMethods ar = new AreaOfARectangleUsingMethods();
		double length=3.00,breadth=6.50;
		
		double area=ar.areaOfRectangle(length,breadth);
		System.out.println("The area of the rectangle is :" +area);
	}
	public double areaOfRectangle(double length,double breadth) {
		double area;
		
		area=length*breadth;
		
		return area;
	}
}
