
public class Vegetables {

	String type;
	String partOfPlant;
	boolean allSeasons;
	int price;
	
	public Vegetables() { //no parameters
		System.out.println("Initialising");
	}
		
	public Vegetables(String stType) { //One parameter
		System.out.println();
		System.out.println("Initialising type");
		type = stType;	
	}
	
	public Vegetables(String stPartOfPlant,boolean boAllSeasons) { //Two parameters
		System.out.println();
		System.out.println("Initialising part of plant,if available all seasons");
		partOfPlant = stPartOfPlant;
		allSeasons = boAllSeasons;
	}
	
	public Vegetables(String stType,String stPartOfPlant,boolean boAllSeasons,int inPrice) {//All parameters
		System.out.println();
		System.out.println("Initialising type,part of plant,if available all seasons,price");
		type = stType;
		partOfPlant = stPartOfPlant;
		allSeasons = boAllSeasons;
		price = inPrice;
	}
	
	public void cooking(int n){
		System.out.println("cooking"+n);
	}
	public void cutting(int n){
		System.out.println("cutting"+n);
	}
	public void juicing(int n){
		System.out.println("juicing"+n);
	}
}


