public class BagConstructer {

	String brand;
	String type;
	int numOfZips;
	int sizeInInches;
	double price;
	
	public BagConstructer() { //no parameters
		System.out.println("Initialising");
	}
		
	public BagConstructer(String stBrand) { //One parameter
		System.out.println();
		System.out.println("Initialising brand");
		brand = stBrand;	
	}
	
	public BagConstructer(String stType,int inNumOfZips) { //Two parameters
		System.out.println();
		System.out.println("Initialising type,no of zips");
		type = stType;
		numOfZips = inNumOfZips;
	}
	
	public BagConstructer(String stBrand,String stType,int inNumOfZips,
			int inSizeInInches,double doPrice) {//All parameters
		System.out.println();
		System.out.println("Initialising brand,type,no of zips,size,price");
		brand = stBrand;
		type = stType;
		numOfZips = inNumOfZips;
		sizeInInches = inSizeInInches;
		price = doPrice;
	}
	
	public void openingZips(int num) {
		System.out.println(num+" zip is opened");
	}
	
	public void storingItems(String item) {
		System.out.println("u are storing " +item);
	}
	
	public void adjustingStrap(String action) {
		System.out.println("the strap is " +action);
	}
}
