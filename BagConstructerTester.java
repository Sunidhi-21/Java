
public class BagConstructerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		
		BagConstructer xyz = new BagConstructer();
		System.out.println("brand name: "+ xyz.brand);
		
		BagConstructer wildCraft = new BagConstructer("wildcraft");
		System.out.println("brand name: "+ wildCraft.brand);
		wildCraft.openingZips(1);
		
		BagConstructer jansport = new BagConstructer("to carry books",3);
		System.out.println("Type of bag: "+ jansport.type);
		System.out.println("No of zips: "+ jansport.numOfZips);
		jansport.storingItems("books");
		
		BagConstructer americanTourister = new BagConstructer("American Tourister","to carry luggage",
				4,50,3000);
	
		System.out.println("Brand: "+ americanTourister.brand);
		System.out.println("Type of bag: "+ americanTourister.type);
		System.out.println("No of zips: "+ americanTourister.numOfZips);
		System.out.println("Size of bag: "+ americanTourister.sizeInInches);
		System.out.println("price of bag: "+ americanTourister.price);
		americanTourister.adjustingStrap("short");
		
		System.out.println("End");
	}
}