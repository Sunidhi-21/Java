
public class IceCream {
	String company;
	String flavour;
	int price;
	boolean popSickle;
	
	public IceCream() { //no parameters
		System.out.println("Initialising");
	}
		
	public IceCream(String stCompany) { //One parameter
		System.out.println();
		System.out.println("Initialising company");
		company = stCompany;	
	}
	
	public IceCream(String stFlavour,int inPrice) {//All parameters
		System.out.println();
		System.out.println("Initialising flavour,price");
		flavour=stFlavour;
		price=inPrice;
	}
	
	public IceCream(String stCompany,String stFlavour,int inPrice,boolean boPopSickle) {//All parameters
		System.out.println();
		System.out.println("Initialising company,flavour,price,if popsickle");
		company=stCompany;
		flavour=stFlavour;
		price=inPrice;
		popSickle=boPopSickle;
	}
	
	public void cone(){
		System.out.println("cone icecream");
	}
	public void cup(){
		System.out.println("cup icecream");
	}
	public void popsickle(boolean bool){
		if(bool==true)
			System.out.println("popsickle");
		else
			System.out.println("not popsickle");
	}
}

