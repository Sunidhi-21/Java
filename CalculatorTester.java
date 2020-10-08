
public class CalculatorTester {
	
	public static void main(String[] args) {
		
		System.out.println("Begin creating calaculator");
		
		Calculator citizen = new Calculator();
		
		citizen.brand="citizen";
		citizen.sizeInCm=12;
		citizen.type="General purpose";
		citizen.price=1000;
		
		citizen.addition(1,2);
		citizen.subtraction(2,1);
		citizen.multiplication(1,2);
		System.out.println("End creating calaculator");
	}

}

