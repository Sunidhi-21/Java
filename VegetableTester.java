
public class VegetableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		
		Vegetables beans = new Vegetables();
		System.out.println("Vegetable name: "+ beans.type);
		
		Vegetables carrot = new Vegetables("carrot");
		System.out.println("Vegetable name: "+ carrot.type);
		carrot.cooking(1);
		
		Vegetables radish= new Vegetables("root",true);
		System.out.println("part of the plant: "+ radish.partOfPlant);
		System.out.println("if available all seasons: "+ radish.allSeasons);
		radish.cutting(2);
		
		Vegetables spinach = new Vegetables("spinach","leaf",true,70);
		System.out.println("Vegetable name: "+ spinach.type);
		System.out.println("part of the plant: "+ spinach.partOfPlant);
		System.out.println("if available all seasons: "+ spinach.allSeasons);
		System.out.println("price: "+ spinach.price);
		spinach.juicing(3);
}
}