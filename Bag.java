

public class Bag {

	String brand;
	String type;
	int numOfZips;
	int sizeInInches;
	double price;
	
	public void openingZips(int num) {
		System.out.println(num+" zip is opened");
	}
	
	public void storingItems(String item) {
		System.out.println("u are storing " +item);
	}
	
	public void adjustingStrap(String action) {
		System.out.println("the strap is: " +action);
	}
	
}
