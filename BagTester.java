
public class BagTester {

	public static void main(String[] args) {
		
		System.out.println("Begin creating bag");
		
		Bag wildCraft = new Bag();
		wildCraft.brand = "Wildcraft";
		wildCraft.type = "To carry books";
		wildCraft.numOfZips = 4;
		wildCraft.sizeInInches = 25;
		wildCraft.price = 2000;
		
		wildCraft.openingZips(1);
		wildCraft.storingItems("books");
		wildCraft.adjustingStrap("short");
		
		System.out.println("End creating bag");
		
	}
}
