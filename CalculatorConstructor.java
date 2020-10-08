
public class CalculatorConstructor {
	
	String brand;
	int sizeInCm;
	String type;
	double price;
	
	public CalculatorConstructor() { //no parameters
		System.out.println("Initialising");
	}
		
	public CalculatorConstructor(String stBrand) { //One parameter
		System.out.println();
		System.out.println("Initialising brand");
		brand = stBrand;	
	}
	
	public CalculatorConstructor(String stType,int inSizeInCm) { //Two parameters
		System.out.println();
		System.out.println("Initialising type and size");
		type = stType;
		sizeInCm = inSizeInCm; 
	}
	
	public CalculatorConstructor(String stBrand,int inSizeInCm,String stType,
			double doPrice) {//All parameters
		System.out.println();
		System.out.println("Initialising brand,type,no of zips,size,price");
		brand = stBrand;
		sizeInCm = inSizeInCm;
		type = stType;
		price = doPrice;
	}
	
	public int addition(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	public int subtraction(int num1,int num2) {
		int diff=num1-num2;
		return diff;
	}
	public int multiplication(int num1,int num2) {
		int pro=num1*num2;
		return pro;
	}

}
