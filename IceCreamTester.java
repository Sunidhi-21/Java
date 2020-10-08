
public class IceCreamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream amul = new IceCream();
		System.out.println("the company: "+amul.company);
		
		IceCream arun = new IceCream("arun");
		System.out.println("the company: "+arun.company);
		arun.cone();
		
		IceCream vadilal = new IceCream("vanilla",20);
		System.out.println("the flavour: "+vadilal.flavour);
		System.out.println("the price: "+vadilal.price);
		vadilal.cup();
		
		IceCream kwalityWalls = new IceCream("kwalityWalls","orange",15,true);
		System.out.println("the company: "+kwalityWalls.company);
		System.out.println("the flavour: "+kwalityWalls.flavour);
		System.out.println("the price: "+kwalityWalls.price);
		System.out.println("is popsickle or not: "+kwalityWalls.popSickle);
		kwalityWalls.popsickle(true);
	}

}
